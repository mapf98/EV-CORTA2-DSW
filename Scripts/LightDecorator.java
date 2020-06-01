public class LightDecorator extends PhotoDecorator {
  public double light;

  public LightDecorator(Photo decoratedPhoto, double light) {
    super(decoratedPhoto);
    this.light = light;
  };

  @Override
  public void description() {
    super.description();
    System.out.println(changeLight());
  };
  
  public String changeLight() {
    return "Light: " + light;
  };
};