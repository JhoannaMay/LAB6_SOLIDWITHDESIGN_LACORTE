public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void borrowResource(LibraryResource resource) {
        System.out.println(name + " is attempting to borrow: " + resource.getTitle());
        resource.borrow();
    }
}
