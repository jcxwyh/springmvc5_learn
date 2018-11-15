package pro.onlyou.springmvc5.xml.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {

        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(s);
        }catch (Exception e){
            e.printStackTrace();
        }

        return date;
    }
}
