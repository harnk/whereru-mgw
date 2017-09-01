package com.harnk.whereru.mgw.whererumgw.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by scottnull on 8/31/17.
 */

@RestController
public class ApiController {

    @RequestMapping("/join")
    public String doJoin() {
        return "join tbd";
    }

    @RequestMapping("/leave")
    public String doLeave() {
        return "leave tbd";
    }

    @RequestMapping("/update")
    public String doUpdate() {
        return "update tbd";
    }

    @RequestMapping("/message")
    public String doMessage() {
        return "message tbd";
    }

    @RequestMapping("/find")
    public String doFind() {
        return "find tbd";
    }

    @RequestMapping("/imhere")
    public String doImhere() {
        return "imhere tbd";
    }

    @RequestMapping("/liveupdate")
    public String doLiveUpdate() {
        return "liveupdate tbd";
    }

    @RequestMapping("/getroom")
    public String doGetRoom() {
        return "getroom tbd";
    }

    @RequestMapping("/getroommessages")
    public String doGetRoomMessages() {
        return "getroommessages tbd";
    }

}
