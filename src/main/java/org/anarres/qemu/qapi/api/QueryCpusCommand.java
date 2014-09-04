package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-cpus, returns=[CpuInfo], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-cpus, returns=[CpuInfo], data=null}
public class QueryCpusCommand extends QApiCommand<java.lang.Void, QueryCpusCommand.Response> {

	/** Response to a QueryCpusCommand. */
	public static class Response extends QApiResponse<java.util.List<CpuInfo>> {
	}

	/** Constructs a new QueryCpusCommand. */
	public QueryCpusCommand() {
		super("query-cpus", Response.class, null);
	}

}
