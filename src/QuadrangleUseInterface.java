interface drawTest{
    public void draw();
}
class PU extends QuadrangleUseInterface implements drawTest{
    public void draw(){
        System.out.println("平行四边形.draw()");
    }
    void doAnyThing(){}
}
class SU extends QuadrangleUseInterface implements drawTest{
    public void draw(){
        System.out.println("正方形.draw()");
    }
    void doAnyThing(){}
}
public class QuadrangleUseInterface {
    void doAnyThing(){}
    public static void main(String[] args){
        drawTest[] d = {
                new SU(),new PU()
        };
        for(int i=0;i<d.length;i++){
            d[i].draw();
        }
    }
}
