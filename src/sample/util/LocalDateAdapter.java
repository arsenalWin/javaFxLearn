package sample.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;

/**
 * @Author: zhouwei
 * @Description:
 * @Date: Create in 16:07 2018-8-30
 * @Modified By:
 */
public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
  @Override
  public LocalDate unmarshal(String v) throws Exception {
    return LocalDate.parse(v);
  }

  @Override
  public String marshal(LocalDate v) throws Exception {
    return v.toString();
  }
}
