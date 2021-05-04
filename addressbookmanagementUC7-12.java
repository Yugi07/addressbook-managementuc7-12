package addressbookmanagement;

import java.util.ArrayList;

public class addressbookmanagement {

	private int id;
	private String name;
	private int age;
	private double source;

	public Student() {
		super();
	}

	public Student(int id, String name, int age, double source) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.source = source;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSource() {
		return source;
	}

	public void setSource(double source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", source=" + source + "]";
   }	
 }
}
public class Addressbookmanagement {
    public ststic void main(string[] args) {
   Map<string,AddressBook> map= new HashMap<string, AddressBook>()
   buildData(map);

   addcontact("friend", map,new contact("yugesh", "ram", "kumar",))
   map.get("friend").get contact().foreach(system.out::println);

   List<contact> list =  searchBycity("Tamilnadu:,map);
   system.out.println(list);
}

private static List<contact> searchBycity(string cityName,map<string>();
  predicate<contact> predicate = (c) -> c.getcity().equalsIgnore();
  List<contact> result = new ArrayList<>();
  map.values().stream().foreachab->( result.addAll(ab.getcontact().stream().filter(predicatec).collect(collectors.toList()))};
 
  return result;
}
private ststic void buildData(Map<string,AddressBook> map) {
  set<contact>contacts = get Dummycontact().
}
private static set <contact> getDummycontact1() {
  set<contact> contact = new Hashset<contact>();
  contacts.add(new contact("sam" , "Annakg", "Erode"));
  contacts.add(new contact("Ram" , "Cheran", "karur"));
  contacts.add(new contact("Kumar" , "Paramathi", "Chennai"));
  contacts.add(new contact("John" , "Palayam", "Avanasi"));
  contacts.add(new contact("Kevin" , "Covai", "Trichy"));
  return contacts;
}
private static set <contact> getDummycontact2() {
  set<contact> contact = new Hashset<contact>();
  contacts.add(new contact("Jana" , "Annakg", "Murusi"));
  contacts.add(new contact("Gowtham" , "Cheran", "Mattupalayam"));
  contacts.add(new contact("Bose" , "Paramathi", "Kangayam"));
  contacts.add(new contact("Prakesh" , "Palayam", "Vellore"));
  contacts.add(new contact("Yugesh" , "Colony", "Kumari"));
  return contacts;
 }
}

