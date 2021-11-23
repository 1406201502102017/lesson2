package gb.homework.oop.lesson_8;

public class Wall {

    private final int height;

    public interface WallIn {
        boolean jump(int height);
        boolean jumper(Human human);
        boolean jumper(Cat cat);
        boolean jumper(Robot robot);
    }
    public Wall(int height) {
        this.height = height;
    }
	if(jumper.jump(this.height)) {
        System.out.print(human.name + cat.name + robot.name);
            return true;
    }
        System.out.print(human.name + cat.name + robot.name);
	        return false;
}
