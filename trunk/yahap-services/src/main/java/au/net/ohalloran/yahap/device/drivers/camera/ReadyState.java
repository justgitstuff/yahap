package au.net.ohalloran.yahap.device.drivers.camera;



public class ReadyState implements CameraState
{
    AbstractCamera camera;
    
    public ReadyState(AbstractCamera camera) {
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
