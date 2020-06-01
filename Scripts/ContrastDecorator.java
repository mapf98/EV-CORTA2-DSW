public class ContrastDecorator extends PhotoDecorator {
  public double contrast;

  public ContrastDecorator(Photo decoratedPhoto, double contrast) {
    super(decoratedPhoto);
    this.contrast = contrast;
  };

  @Override
  public void description() {
    super.description();
    System.out.println(changeContrast());
  };
  
  public String changeContrast() {
    return "Contrast: " + contrast;
  };
}