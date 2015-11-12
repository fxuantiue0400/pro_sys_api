package device.service.impl;

import org.springframework.stereotype.Service;
import pro.device.DeviceService;

/**
 * Created by weixuan on 2015/10/25.
 */
@Service("deviceService")
public class DeviceServiceImpl implements DeviceService {
    public String getDeviceById(int id) {
        return "aaaaa:"+id;
    }
}
