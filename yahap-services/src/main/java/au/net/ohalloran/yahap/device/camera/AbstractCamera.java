package au.net.ohalloran.yahap.device.camera;

import au.net.ohalloran.yahap.device.Camera;
import au.net.ohalloran.yahap.device.Device;
import au.net.ohalloran.yahap.device.OnOff;
import au.net.ohalloran.yahap.device.camera.CameraState;

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
