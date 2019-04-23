package fileupload;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	@ResponseBody
	@RequestMapping(value = "/upload", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	public String upload(MultipartFile file) {
		try {
			FileUtils.writeByteArrayToFile(new File("D://"+file.getOriginalFilename()), file.getBytes());
			return "上传成功";
		} catch (IOException e) {
			e.printStackTrace();
			return "上传失败";
		}
	}
	
	@RequestMapping("/user")
    public String user(@ModelAttribute("msg") String msg, UserBean userBean) {
        System.out.println("username is :" + userBean.getUserName() + ";and id is :" + userBean.getId());
        throw new IllegalArgumentException("抱歉，参数异常/ 来自@ModelAttribute:" + msg);
    }
	
	
}
