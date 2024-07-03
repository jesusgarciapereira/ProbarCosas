package pruebas;

import school.Classroom;

public class CorrigiendoTest {
	public CorrigiendoTest() {
	}

	public static void main(String[] args) {
		System.out.println(Classroom.globalKey);
		Classroom room = new Classroom(101, "Mrs. Anderson");
		System.out.println(room.roomNumber);
		System.out.println(room.floor);
		System.out.println(room.teacherName);

	}

}
