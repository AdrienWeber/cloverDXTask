import org.jetel.data.DataRecord;
import org.jetel.exception.ComponentNotReadyException;
import org.jetel.exception.JetelRuntimeException;
import org.jetel.component.DataRecordTransform;

public class MyTransform extends DataRecordTransform {

	@Override
	public int transform(DataRecord[] input, DataRecord[] output) {
		try {
			// Your code goes here.
		} catch (Exception e) {
			throw new JetelRuntimeException(e);
		}

		return DataRecordTransform.ALL;
	}

/*
	@Override
	public boolean init() throws ComponentNotReadyException {
		return super.init();
	}

	@Override
	public void preExecute() throws ComponentNotReadyException {
	}

	@Override
	public void postExecute() throws ComponentNotReadyException {
	}
*/
}
