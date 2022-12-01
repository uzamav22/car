public class Tank {
    private int positionX;
    private int positionY;
    private int direction;
    private int fuel;
    public Tank(int x, int y,int fuel){
        positionY=y;
        positionX=x;
        this.fuel=fuel;
    }
    public Tank(int x, int y){
        this(x,y,100);
    }
    public Tank(){
        this(0,0);
    }
    public void goForward(int distance){
        if(Math.abs(distance)>fuel) {
            if(distance>0)
                distance = fuel;
            else
                distance=-fuel;
        }
        if(direction==0)
            positionX+=distance;
        else if(direction==2)
            positionX-=distance;
        else if(direction==3)
            positionY+=distance;
        else if(direction==1)
            positionY-=distance;
        fuel-=distance;
    }
    public void goBackward(int distance){
        goForward(-distance);
    }
    public void turnLeft() {
        direction--;
        if (direction == -1) direction = 3;
    }
    public void turnRight() {
        direction++;
        if (direction == 4) direction = 0;
    }
    public void printPosition(){
        System.out.println("TheTank is at " + positionX+ ", " +positionY+ " now.");
    }

}
