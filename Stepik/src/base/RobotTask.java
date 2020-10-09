package base;

import java.math.*;
import java.util.Arrays;

public class RobotTask {
	public static void main(String[] args) {
		Robot robot = new Robot(0, 0, Direction.UP);
		moveRobot(robot, -10, 20);
		System.out.printf("x=%d,y=%d",robot.getX(),robot.getY());
	}

	public enum Direction {
		UP, DOWN, LEFT, RIGHT
	}

	public static class Robot {
		int x;
		int y;
		Direction dir;

		public Robot(int x, int y, Direction dir) {
			this.x = x;
			this.y = y;
			this.dir = dir;
		}

		public Direction getDirection() {
			return dir;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public void turnLeft() {
			if (dir == Direction.UP) {
				dir = Direction.LEFT;
			} else if (dir == Direction.DOWN) {
				dir = Direction.RIGHT;
			} else if (dir == Direction.LEFT) {
				dir = Direction.DOWN;
			} else if (dir == Direction.RIGHT) {
				dir = Direction.UP;
			}
		}

		public void turnRight() {
			if (dir == Direction.UP) {
				dir = Direction.RIGHT;
			} else if (dir == Direction.DOWN) {
				dir = Direction.LEFT;
			} else if (dir == Direction.LEFT) {
				dir = Direction.UP;
			} else if (dir == Direction.RIGHT) {
				dir = Direction.DOWN;
			}
		}

		public void stepForward() {
			if (dir == Direction.UP) {
				y++;
			}
			if (dir == Direction.DOWN) {
				y--;
			}
			if (dir == Direction.LEFT) {
				x--;
			}
			if (dir == Direction.RIGHT) {
				x++;
			}
		}
	}

	public static void moveRobot(Robot robot, int toX, int toY) {
		
		
		
		if (toX > 0) {
			robot.turnRight();
			for (int i = 0; i < Math.abs(toX); i++) {
				robot.stepForward();
			}
			if (toY != robot.getY()) {
				if (toY < 0) {
					robot.turnRight();
					for (int i = 0; i < Math.abs(toY); i++) {
						robot.stepForward();
					}
				} else {
					robot.turnLeft();
					for (int i = 0; i <  Math.abs(toY); i++) {
						robot.stepForward();
					}
				}
			}
		} else if (toX < 0) {
			robot.turnLeft();
			for (int i = 0; i <  Math.abs(toX); i++) {
				robot.stepForward();
			}
			if (toY != robot.getY()) {
				if (toY < 0) {
					robot.turnLeft();
					for (int i = 0; i <  Math.abs(toY); i++) {
						robot.stepForward();
					}
				} else {
					robot.turnRight();
					for (int i = 0; i <  Math.abs(toY); i++) {
						robot.stepForward();
					}
				}
			}
		} else {
			if (toY < 0) {
				robot.turnLeft();
				robot.turnLeft();
				for (int i = 0; i <  Math.abs(toY); i++) {
					robot.stepForward();
				}
			} else {
				for (int i = 0; i <  Math.abs(toY); i++) {
					robot.stepForward();
				}
			}
		}

	}
}
