public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Alice");

        LibraryResource book = new Book("Effective Java");
        LibraryResource journal = new Journal("ACM Computing Surveys");
        LibraryResource thesis = new Thesis("Neural Networks in Education");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(thesis);
    }
}
