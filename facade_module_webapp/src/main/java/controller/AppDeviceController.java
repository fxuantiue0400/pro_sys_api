package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pro.device.DeviceService;

/**
 * Created by weixuan on 2015/11/12.
 */
@Controller
public class AppDeviceController {
    @Autowired
    DeviceService deviceService;

    public AppDeviceController(){
        System.out.println("controller init...");
    }

    @ResponseBody
    @RequestMapping(value = "/aaa",produces = "application/json")
    public String ret(){
        System.out.print(deviceService.getDeviceById(111));
        return deviceService.getDeviceById(111);
    }
}
