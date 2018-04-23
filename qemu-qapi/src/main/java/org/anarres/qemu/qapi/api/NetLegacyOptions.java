package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiUnionDescriptor{name=NetLegacyOptions, discriminator=type, data={none=NetdevNoneOptions, nic=NetLegacyNicOptions, user=NetdevUserOptions, tap=NetdevTapOptions, l2tpv3=NetdevL2TPv3Options, socket=NetdevSocketOptions, vde=NetdevVdeOptions, bridge=NetdevBridgeOptions, netmap=NetdevNetmapOptions, vhost-user=NetdevVhostUserOptions}, innerTypes=null, fields=null, base={type=NetLegacyOptionsType}, discriminatorField=null}</pre>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetLegacyOptions extends NetLegacyOptionsBase implements QApiUnion {

	// union {
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("none")
	@JsonUnwrapped
	@CheckForNull
	public NetdevNoneOptions none;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("nic")
	@JsonUnwrapped
	@CheckForNull
	public NetLegacyNicOptions nic;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("user")
	@JsonUnwrapped
	@CheckForNull
	public NetdevUserOptions user;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("tap")
	@JsonUnwrapped
	@CheckForNull
	public NetdevTapOptions tap;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("l2tpv3")
	@JsonUnwrapped
	@CheckForNull
	public NetdevL2TPv3Options l2tpv3;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("socket")
	@JsonUnwrapped
	@CheckForNull
	public NetdevSocketOptions socket;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("vde")
	@JsonUnwrapped
	@CheckForNull
	public NetdevVdeOptions vde;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bridge")
	@JsonUnwrapped
	@CheckForNull
	public NetdevBridgeOptions bridge;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("netmap")
	@JsonUnwrapped
	@CheckForNull
	public NetdevNetmapOptions netmap;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("vhost-user")
	@JsonUnwrapped
	@CheckForNull
	public NetdevVhostUserOptions vhostUser;
	// }

	@Nonnull
	public static NetLegacyOptions none(@Nonnull NetdevNoneOptions none) {
		NetLegacyOptions self = new NetLegacyOptions();
		self.type = NetLegacyOptionsType.none;
		self.none = none;
		return self;
	}

	@Nonnull
	public static NetLegacyOptions nic(@Nonnull NetLegacyNicOptions nic) {
		NetLegacyOptions self = new NetLegacyOptions();
		self.type = NetLegacyOptionsType.nic;
		self.nic = nic;
		return self;
	}

	@Nonnull
	public static NetLegacyOptions user(@Nonnull NetdevUserOptions user) {
		NetLegacyOptions self = new NetLegacyOptions();
		self.type = NetLegacyOptionsType.user;
		self.user = user;
		return self;
	}

	@Nonnull
	public static NetLegacyOptions tap(@Nonnull NetdevTapOptions tap) {
		NetLegacyOptions self = new NetLegacyOptions();
		self.type = NetLegacyOptionsType.tap;
		self.tap = tap;
		return self;
	}

	@Nonnull
	public static NetLegacyOptions l2tpv3(@Nonnull NetdevL2TPv3Options l2tpv3) {
		NetLegacyOptions self = new NetLegacyOptions();
		self.type = NetLegacyOptionsType.l2tpv3;
		self.l2tpv3 = l2tpv3;
		return self;
	}

	@Nonnull
	public static NetLegacyOptions socket(@Nonnull NetdevSocketOptions socket) {
		NetLegacyOptions self = new NetLegacyOptions();
		self.type = NetLegacyOptionsType.socket;
		self.socket = socket;
		return self;
	}

	@Nonnull
	public static NetLegacyOptions vde(@Nonnull NetdevVdeOptions vde) {
		NetLegacyOptions self = new NetLegacyOptions();
		self.type = NetLegacyOptionsType.vde;
		self.vde = vde;
		return self;
	}

	@Nonnull
	public static NetLegacyOptions bridge(@Nonnull NetdevBridgeOptions bridge) {
		NetLegacyOptions self = new NetLegacyOptions();
		self.type = NetLegacyOptionsType.bridge;
		self.bridge = bridge;
		return self;
	}

	@Nonnull
	public static NetLegacyOptions netmap(@Nonnull NetdevNetmapOptions netmap) {
		NetLegacyOptions self = new NetLegacyOptions();
		self.type = NetLegacyOptionsType.netmap;
		self.netmap = netmap;
		return self;
	}

	@Nonnull
	public static NetLegacyOptions vhostUser(@Nonnull NetdevVhostUserOptions vhostUser) {
		NetLegacyOptions self = new NetLegacyOptions();
		self.type = NetLegacyOptionsType.vhost_user;
		self.vhostUser = vhostUser;
		return self;
	}

	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("none");
		names.add("nic");
		names.add("user");
		names.add("tap");
		names.add("l2tpv3");
		names.add("socket");
		names.add("vde");
		names.add("bridge");
		names.add("netmap");
		names.add("vhost-user");
		return names;
	}

	@JsonIgnore
	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("none".equals(name))
			return none;
		if ("nic".equals(name))
			return nic;
		if ("user".equals(name))
			return user;
		if ("tap".equals(name))
			return tap;
		if ("l2tpv3".equals(name))
			return l2tpv3;
		if ("socket".equals(name))
			return socket;
		if ("vde".equals(name))
			return vde;
		if ("bridge".equals(name))
			return bridge;
		if ("netmap".equals(name))
			return netmap;
		if ("vhost-user".equals(name))
			return vhostUser;
		return super.getFieldByName(name);
	}

	@JsonIgnore
	public boolean isValidUnion() {
		int count = 0;
		if (none != null)
			count++;
		if (nic != null)
			count++;
		if (user != null)
			count++;
		if (tap != null)
			count++;
		if (l2tpv3 != null)
			count++;
		if (socket != null)
			count++;
		if (vde != null)
			count++;
		if (bridge != null)
			count++;
		if (netmap != null)
			count++;
		if (vhostUser != null)
			count++;
		return (count == 1);
	}
}