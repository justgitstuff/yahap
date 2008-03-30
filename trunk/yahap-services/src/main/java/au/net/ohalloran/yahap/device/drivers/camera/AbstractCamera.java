package au.net.ohalloran.yahap.device.drivers.camera;

import au.net.ohalloran.yahap.device.drivers.Camera;
import au.net.ohalloran.yahap.device.drivers.Device;
import au.net.ohalloran.yahap.device.drivers.OnOff;

public abstract class AbstractCamera implements OnOff, Camera, Device
{
    
    protected CameraState state;

    @Override
    public void off()
    {
	// TODO Auto-generated method stub

    }

    @Override
    public void on()
    {
	// TODO Auto-generated method stub

    }

    @Override
    public void takePhoto()
    {
	// TODO Auto-generated method stub

    }

    @Override
    public void refreshState()
    {
	// TODO Auto-generated method stub

    }

}
