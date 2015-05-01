package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=query-memdev, returns=[Memdev], data=null}</pre>
 */
// QApiCommandDescriptor{name=query-memdev, returns=[Memdev], data=null}
public class QueryMemdevCommand extends QApiCommand<java.lang.Void, QueryMemdevCommand.Response> {

	/** Response to a QueryMemdevCommand. */
	public static class Response extends QApiResponse<java.util.List<Memdev>> {
	}

	/** Constructs a new QueryMemdevCommand. */
	public QueryMemdevCommand() {
		super("query-memdev", Response.class, null);
	}

}
