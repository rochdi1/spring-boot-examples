package com.in28minutes.springboot.rest.example.dynamicfiltering;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

//import org.jspecify.annotations.NonNull;
import org.springframework.http.ResponseEntity;
//import org.springframework.http.codec.JacksonCodecSupport;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class FilteringController {

    // field1,field2
    /** WITH MappingJacksonValue **/
//    @GetMapping("/filtering")
//    public MappingJacksonValue retrieveSomeBean() {
//        var someBean = new SomeBean("value1", "value2", "value3");
//        var filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
//        var filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
//        var mapping = new MappingJacksonValue(someBean);
//        mapping.setFilters(filters);
//
//        return mapping;
//    }

    /**
     * WITH JSON view Dynamic Filter for
     *
     * @return field1, field2
     */
//    @GetMapping("/filtering")
//    public ResponseEntity<@NonNull SomeBean> retrieveSomeBeanWithViewAndFilter() {
//        var someBean = new SomeBean("value1", "value2", "value3");
//
//        // Dynamic filter: allow only field1, field3
//        var filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
//        var filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
//
//        return ResponseEntity.ok()
//                .hint(JacksonCodecSupport.JSON_VIEW_HINT, Views.Public.class)
//                .hint(JacksonCodecSupport.FILTER_PROVIDER_HINT, filters)
//                .body(someBean);
//    }

    
    /**
     * Kombinierter JSON-View und Dynamic Filter über MappingJacksonValue
     *
     * @return field1, field3 (eingeschränkt durch View und Filter)
     */
    @GetMapping("/filtering")
    public ResponseEntity<MappingJacksonValue> retrieveSomeBeanWithViewAndFilter() {
        var someBean = new SomeBean("value1", "value2", "value3");

        // 1. Filter definieren (erlaubt nur field1 und field3)
        var filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
        var filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

        // 2. MappingJacksonValue als Container nutzen
        var mapping = new MappingJacksonValue(someBean);
        mapping.setFilters(filters);                // Filter zuweisen
        mapping.setSerializationView(Views.Public.class); // Jackson View zuweisen

        // 3. Verpackt in einer ResponseEntity zurückgeben
        return ResponseEntity.ok(mapping);
    }
    

    // field2, field3
//    @GetMapping("/filtering-list")
//    public MappingJacksonValue retrieveListOfSomeBeans() {
//        List<SomeBean> list = List.of(
//                new SomeBean("value1", "value2", "value3"),
//                new SomeBean("value12", "value22", "value32")
//        );
//        var filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
//        var filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
//        var mapping = new MappingJacksonValue(list);
//        mapping.setFilters(filters);
//
//        return mapping;
//    }
    @GetMapping("/filtering-list")
    public ResponseEntity<MappingJacksonValue> retrieveListOfSomeBeans() {
        List<SomeBean> list = List.of(
                new SomeBean("value1", "value2", "value3"),
                new SomeBean("value12", "value22", "value32")
        );
        var filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
        var filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        
        var mapping = new MappingJacksonValue(list);
        mapping.setFilters(filters);

        return ResponseEntity.ok(mapping);
    }
}