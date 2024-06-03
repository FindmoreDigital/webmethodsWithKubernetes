package containerization.svcs;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.Map;
import com.softwareag.util.IDataMap;
// --- <<IS-END-IMPORTS>> ---

public final class priv

{
	// ---( internal utility methods )---

	final static priv _instance = new priv();

	static priv _newInstance() { return new priv(); }

	static priv _cast(Object o) { return (priv)o; }

	// ---( server methods )---




	public static final void patchCostumerByID_sqlQueryFields (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(patchCostumerByID_sqlQueryFields)>> ---
		// @sigtype java 3.5
		// [i] recref:0:required request containerization.docs.business:costumer
		// [i] recref:0:required persisted containerization.docs.business:costumer
		// [o] field:0:required queryValues
		IDataMap pipeMap = new IDataMap(pipeline);
		IDataMap request = pipeMap.getAsIDataMap("request");
		IDataMap persisted = pipeMap.getAsIDataMap("persisted");
		
		StringBuilder builder = new StringBuilder();
		
		String name = request.getAsString("name");
		if(name != null) builder.append(", name = '" + name + "'");
		else builder.append(persisted.getAsString("name") != null ? ", name = '" + persisted.getAsString("name") + "'" : "");
		
		String birthday = request.getAsString("birthday");
		if(birthday != null) builder.append(", birthday = '" + birthday + "'");
		else builder.append(persisted.getAsString("birthday") != null ? ", birthday = '" + persisted.getAsString("birthday") + "'" : "");
		
		String email = request.getAsString("email");
		if(email != null) builder.append(", email = '" + email + "'");
		else builder.append(persisted.getAsString("email") != null ? ", email = '" + persisted.getAsString("email") + "'" : "");
		
		String phone = request.getAsString("phone");
		if(phone != null) builder.append(", phone = '" + phone + "'");
		else builder.append(persisted.getAsString("phone") != null ? ", phone = '" + persisted.getAsString("phone") + "'" : "");
		
		pipeMap.put("queryValues", builder.toString().replaceFirst(",", ""));
		// --- <<IS-END>> ---

                
	}
}

