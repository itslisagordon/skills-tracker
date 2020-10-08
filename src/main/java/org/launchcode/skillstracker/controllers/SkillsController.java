package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("")
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String baseText(){
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    @ResponseBody
    public String favLanguageForm() {
        return "<html>" +
                "<body>" +
                "<form action='formsubmission' method='post'>" +
                "<p>Name:</p>" +
                "<input type='text' name='name'><br>" +
                "<p>My favorite language:</p><select name='language1' id='language1-select'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<p>My second favorite language:</p><select name='language2' id='language2-select'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<p>My third favorite language:</p><select name='language3' id='language3-select'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("formsubmission")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>";
    }

}
