//Create the Horse class here.
public class Horse {
  private String hn;
  private boolean t;
  private double w;

  public Horse(String hn, double w, boolean t) {
    this.hn = hn;
    this.t = t;
    this.w = w;
  }

  public String getName(){
    return this.hn;
  }
  public double getWeight(){
    return this.w;
  }
  public boolean getTame(){
    return this.t;
  }
}