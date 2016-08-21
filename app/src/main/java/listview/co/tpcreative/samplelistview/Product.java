package listview.co.tpcreative.samplelistview;

/**
 * Created by phong on 8/21/16.
 */
public class Product {

    private String name = "" ;
    private String id = "" ;


    public Product(String id , String name){
        this.id = id ;
        this.name = name ;
    }


    public String getName(){
        return name ;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getID(){
        return id ;
    }
    public void setID(String id){
        this.id = id;
    }
    public String toString(){
        return name ;
    }

}
