package au.net.ohalloran.yahap.device.drivers.camera;



public class BasicCamera extends AbstractCamera
{
    protected CameraState offState;
    protected CameraState readyState;
    
    public BasicCamera() {
	offState = new OffState(this);
	readyState = new ReadyState(this);
	state = offState;
    }
    
    @Override
    public void takePhoto()
    {
        // TODO Auto-generated method stub
        super.takePhoto();
    }
    
    @Override
    public void on()
    {
        // TODO Auto-generated method stub
        super.on();
    }
    
    @Override
    public void off()
    {
        // TODO Auto-generated method stub
        super.off();
    }
}
