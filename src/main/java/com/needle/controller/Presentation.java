package com.needle.controller;


import com.needle.utlis.SearchMapper;
import com.needle.utlis.SearchUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Component
@RestController
public class Presentation {
    /*
        Initializing the search algo is two step process and is generic to any entity
        1)There should be a entity manger that needs to be autowired
        2)Now Search Utils can be AutoWired to provide helper functions
     */
    @Autowired EntityManager em;
    @Autowired SearchUtils searchUtils;

    /*
    Now the algorithm can simply be used as follows
    Algo have two functions
    searchMultiFieldQuery which takes, table name, n field items ,n search items
    searchMultiFieldQueryOr which takes, table name, n field items ,n search items
    Sort is implemented using first field element
    */

    @PostMapping("/search_and")
    public @ResponseBody List searchDataAnd(@RequestBody SearchMapper map){

        List data= em.createNativeQuery
                (searchUtils.searchMultiFieldQuery(map.getTable(), map.getFields(),map.getSearch()))
                .getResultList();

        return data;
    }
    @PostMapping("/search_or")
    public @ResponseBody List searchDataOr(@RequestBody SearchMapper map){

        List data= em.createNativeQuery
                (searchUtils.searchMultiFieldQueryOr(map.getTable(), map.getFields(),map.getSearch())).getResultList();
        return data;
    }



    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
    }

}
