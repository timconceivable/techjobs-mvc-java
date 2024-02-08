package org.launchcode.techjobsmvc.controllers;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.HashMap;

public class TechJobsController {
    static HashMap<String, String> actionChoices = new HashMap<>();

    @ModelAttribute("actions")
    public static String getActionChoices() {
        return "actions";
    }

//    model.addAttribute("columns", columnChoices);
}
