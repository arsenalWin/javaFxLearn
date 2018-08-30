package sample.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @Author: zhouwei
 * @Description:
 * @Date: Create in 15:34 2018-8-30
 * @Modified By:
 */
@XmlRootElement(name = "persons")
public class PersonListWrapper {
  private List<Person> persons;

  @XmlElement(name = "person")
  public List<Person> getPersons() {
    return persons;
  }

  public void setPersons(List<Person> persons) {
    this.persons = persons;
  }
}
