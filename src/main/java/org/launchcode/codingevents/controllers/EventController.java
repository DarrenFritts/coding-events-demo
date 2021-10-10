package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events") // this will be in the "/events" folder
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        List<String> events = new ArrayList<>();
        events.add("Code With Pride");
        events.add("Strange Loop");
        events.add("Apple WWDC");
        events.add("SpringOne Platform");
        model.addAttribute("events", events);
        return "events/index";
    }

    // located in the "/events" folder in a file named "create"
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

}