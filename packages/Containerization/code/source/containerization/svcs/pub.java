package containerization.svcs;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.softwareag.util.IDataMap;
// --- <<IS-END-IMPORTS>> ---

public final class pub

{
	// ---( internal utility methods )---

	final static pub _instance = new pub();

	static pub _newInstance() { return new pub(); }

	static pub _cast(Object o) { return (pub)o; }

	// ---( server methods )---




	public static final void getAllCostumers_pagesCalculation (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getAllCostumers_pagesCalculation)>> ---
		// @sigtype java 3.5
		// [i] field:0:required count
		// [i] field:0:required limit
		// [i] field:0:required cursor
		// [o] field:0:required pages
		IDataMap pipeMap = new IDataMap(pipeline);
		
		float count = Float.valueOf(pipeMap.getAsString("count"));
		float limit = Float.valueOf(pipeMap.getAsString("limit"));
		float cursr = Float.valueOf(pipeMap.getAsString("cursor"));
		
		if(cursr > count) {
		int diff = (int)(cursr - count);
		cursr -= diff;
		}
		
		int number_of_pages = (int)((count / limit) + 0.5f);
		int current_page = (int)(number_of_pages - (int)(((count - cursr) / limit) + 0.5f));
		
		pipeMap.put("pages", String.format("Page %d of %d", current_page, number_of_pages));
		// --- <<IS-END>> ---

                
	}
}

