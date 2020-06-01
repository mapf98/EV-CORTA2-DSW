public class SaturationDecorator extends PhotoDecorator {
  public double saturation;

  public SaturationDecorator(Photo decoratedPhoto, double saturation) {
    super(decoratedPhoto);
    this.saturation = saturation;
  };

  @Override
  public void description() {
    super.description();
    System.out.println(changeSaturation());
  };
  
  public String changeSaturation() {
    return "Saturation: " + saturation;
  };
};