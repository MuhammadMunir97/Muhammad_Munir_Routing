package com.muhammad.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
    // @RequestMapping("/m/{track}/{module}/{lesson}")
    // public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
    // 	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
    // }
    @RequestMapping("/{track}")
    public String showLesson(@PathVariable("track") String track){
        switch(track){
            case "dojo":
                return "the " + track + " is awesome";
            case "burbank-dojo":
                return  "Burbank Dojo is located in southern California";
            case "san-jose":
                return "SJ dojo the headquareters";
            default:
                return "the dojo was not found";
            }
    }
    	
}
