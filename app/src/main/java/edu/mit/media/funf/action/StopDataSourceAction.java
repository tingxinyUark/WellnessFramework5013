package edu.mit.media.funf.action;

import android.util.Log;

import edu.mit.media.funf.config.Configurable;
import edu.mit.media.funf.datasource.Startable;
import edu.mit.media.funf.datasource.Startable.TriggerAction;
import edu.mit.media.funf.util.LogUtil;

public class StopDataSourceAction extends Action implements TriggerAction {
    
    @Configurable
    private Startable target = null;
    
    StopDataSourceAction() {
    }

    public void setTarget(Startable target) {
        this.target = target;
    }
    
    protected void execute() {
        if (target == null) 
            return;
        Log.d(LogUtil.TAG, "running probe action stop");
        target.stop();
    }
}
