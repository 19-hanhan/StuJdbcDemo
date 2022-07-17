package Entity;

public class Student {

    private String id; // 学生的唯一主键，由数据库自动生成
    private String name; // 学生名称

    // 构造方法
    public Student() {}
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[id: " + id + ", name: " + name + "]";
    }

    // get/set函数
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}