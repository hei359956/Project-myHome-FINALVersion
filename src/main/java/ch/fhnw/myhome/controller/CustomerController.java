/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.acrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/shop")
public class CustomerController {


    @GetMapping
    public String getShop(){
        return "myhome/shop.html";
    }


    @GetMapping("/basetable")
    public String getBase_table(){
        return "../myhome/Base_table.html";
    }

    @GetMapping("/basetable_o")
    public String getBase_table_O(){
        return "../myhome/Base_table_O.html";
    }

    @GetMapping("/beigechair")
    public String getBeige_chair(){
        return "../myhome/Beige_chair.html";
    }

    @GetMapping("/billinginfo")
    public String getBilling_info(){
        return "../myhome/billing_info.html";
    }

    @GetMapping("/brownsofa_b")
    public String getBrown_sofa_B(){
        return "../myhome/Brown_Sofa_B.html";
    }

    @GetMapping("/comfychair")
    public String getComfy_chair(){
        return "../myhome/Comfy_Chair.html";
    }


    @GetMapping("/dinnerset")
    public String getDinner_set(){
        return "../myhome/Dinner_set.html";
    }

    @GetMapping("/foldtable")
    public String getFold_table(){
        return "../myhome/Fold_Table.html";
    }

    @GetMapping("/headers")
    public String getHeaders(){
        return "../myhome/headers.html";
    }

    @GetMapping("/livingroom")
    public String getLiving_room(){
        return "../myhome/Living_room.html";
    }

    @GetMapping("/payment")
    public String getPayment(){
        return "../myhome/payment.html";
    }

    @GetMapping("/pinkchair")
    public String getPink_chair(){
        return "../myhome/Pink_chair.html";
    }

    @GetMapping("/pinkcouch")
    public String getPink_couch(){
        return "../myhome/Pink_Couch.html";
    }


    @GetMapping("/signup")
    public String getsignup(){
        return "../myhome/signup.html";
    }

    @GetMapping("/sofaset")
    public String getSofa_set(){
        return "../myhome/Sofa_set.html";
    }

    @GetMapping("/spacioussofa")
    public String getSpacious_sofa(){
        return "../myhome/Spacious_sofa.html";
    }

    @GetMapping("/standardsofa")
    public String getStandard_sofa(){
        return "../myhome/Standard_sofa.html";
    }

    @GetMapping("/thankyou")
    public String getThankyou(){
        return "../myhome/thank_you.html";
    }

    @GetMapping("/thowrnchair")
    public String getThowrn_chair(){
        return "../myhome/Thowrn_Chair.html";
    }


}
