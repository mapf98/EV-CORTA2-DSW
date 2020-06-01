public class PhotoDecorator implements Photo {
  public Photo decoratedPhoto;

  public PhotoDecorator(Photo decoratedPhoto){
    this.decoratedPhoto = decoratedPhoto;
  };

  @Override
  public void description(){
    this.decoratedPhoto.description();
  };
};