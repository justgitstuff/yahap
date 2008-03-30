package au.net.ohalloran.yahap.device.camera;


public class OffState implements CameraState
{
    AbstractCamera camera;
    
    public OffState(AbstractCamera camera) {
	this.camera = camera;
    }
    
    @Override
    public void takePhoto()
    {
	// TODO Auto-generated method stub

    }

    @Override
    public void turnOff()
    {
	// TODO Auto-generated method stub

    }

    @Override
    public void turnOn()
    {
	// TODO Auto-generated method stub

    }

}
