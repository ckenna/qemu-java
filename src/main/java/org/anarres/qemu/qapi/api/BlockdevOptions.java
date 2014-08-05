package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiUnionDescriptor{name=BlockdevOptions, data={file=BlockdevOptionsFile, host_device=BlockdevOptionsFile, host_cdrom=BlockdevOptionsFile, host_floppy=BlockdevOptionsFile, http=BlockdevOptionsFile, https=BlockdevOptionsFile, ftp=BlockdevOptionsFile, ftps=BlockdevOptionsFile, tftp=BlockdevOptionsFile, vvfat=BlockdevOptionsVVFAT, blkdebug=BlockdevOptionsBlkdebug, blkverify=BlockdevOptionsBlkverify, bochs=BlockdevOptionsGenericFormat, cloop=BlockdevOptionsGenericFormat, cow=BlockdevOptionsGenericCOWFormat, dmg=BlockdevOptionsGenericFormat, parallels=BlockdevOptionsGenericFormat, qcow=BlockdevOptionsGenericCOWFormat, qcow2=BlockdevOptionsQcow2, qed=BlockdevOptionsGenericCOWFormat, raw=BlockdevOptionsGenericFormat, vdi=BlockdevOptionsGenericFormat, vhdx=BlockdevOptionsGenericFormat, vmdk=BlockdevOptionsGenericCOWFormat, vpc=BlockdevOptionsGenericFormat, quorum=BlockdevOptionsQuorum}, innerTypes=null, fields=null, discriminatorField=null}</pre></p>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptions extends BlockdevOptionsBase implements QApiUnion {

	// union {
	@JsonProperty("file")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsFile file;
	@JsonProperty("host_device")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsFile hostDevice;
	@JsonProperty("host_cdrom")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsFile hostCdrom;
	@JsonProperty("host_floppy")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsFile hostFloppy;
	@JsonProperty("http")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsFile http;
	@JsonProperty("https")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsFile https;
	@JsonProperty("ftp")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsFile ftp;
	@JsonProperty("ftps")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsFile ftps;
	@JsonProperty("tftp")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsFile tftp;
	@JsonProperty("vvfat")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsVVFAT vvfat;
	@JsonProperty("blkdebug")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsBlkdebug blkdebug;
	@JsonProperty("blkverify")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsBlkverify blkverify;
	@JsonProperty("bochs")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsGenericFormat bochs;
	@JsonProperty("cloop")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsGenericFormat cloop;
	@JsonProperty("cow")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsGenericCOWFormat cow;
	@JsonProperty("dmg")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsGenericFormat dmg;
	@JsonProperty("parallels")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsGenericFormat parallels;
	@JsonProperty("qcow")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsGenericCOWFormat qcow;
	@JsonProperty("qcow2")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsQcow2 qcow2;
	@JsonProperty("qed")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsGenericCOWFormat qed;
	@JsonProperty("raw")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsGenericFormat raw;
	@JsonProperty("vdi")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsGenericFormat vdi;
	@JsonProperty("vhdx")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsGenericFormat vhdx;
	@JsonProperty("vmdk")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsGenericCOWFormat vmdk;
	@JsonProperty("vpc")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsGenericFormat vpc;
	@JsonProperty("quorum")
	@JsonUnwrapped
	@CheckForNull
	public BlockdevOptionsQuorum quorum;
	// }

	@Nonnull
	public static BlockdevOptions file(@Nonnull BlockdevOptionsFile file) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.file;
		self.file = file;
		return self;
	}

	@Nonnull
	public static BlockdevOptions hostDevice(@Nonnull BlockdevOptionsFile hostDevice) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.host_device;
		self.hostDevice = hostDevice;
		return self;
	}

	@Nonnull
	public static BlockdevOptions hostCdrom(@Nonnull BlockdevOptionsFile hostCdrom) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.host_cdrom;
		self.hostCdrom = hostCdrom;
		return self;
	}

	@Nonnull
	public static BlockdevOptions hostFloppy(@Nonnull BlockdevOptionsFile hostFloppy) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.host_floppy;
		self.hostFloppy = hostFloppy;
		return self;
	}

	@Nonnull
	public static BlockdevOptions http(@Nonnull BlockdevOptionsFile http) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.http;
		self.http = http;
		return self;
	}

	@Nonnull
	public static BlockdevOptions https(@Nonnull BlockdevOptionsFile https) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.https;
		self.https = https;
		return self;
	}

	@Nonnull
	public static BlockdevOptions ftp(@Nonnull BlockdevOptionsFile ftp) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.ftp;
		self.ftp = ftp;
		return self;
	}

	@Nonnull
	public static BlockdevOptions ftps(@Nonnull BlockdevOptionsFile ftps) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.ftps;
		self.ftps = ftps;
		return self;
	}

	@Nonnull
	public static BlockdevOptions tftp(@Nonnull BlockdevOptionsFile tftp) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.tftp;
		self.tftp = tftp;
		return self;
	}

	@Nonnull
	public static BlockdevOptions vvfat(@Nonnull BlockdevOptionsVVFAT vvfat) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.vvfat;
		self.vvfat = vvfat;
		return self;
	}

	@Nonnull
	public static BlockdevOptions blkdebug(@Nonnull BlockdevOptionsBlkdebug blkdebug) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.blkdebug;
		self.blkdebug = blkdebug;
		return self;
	}

	@Nonnull
	public static BlockdevOptions blkverify(@Nonnull BlockdevOptionsBlkverify blkverify) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.blkverify;
		self.blkverify = blkverify;
		return self;
	}

	@Nonnull
	public static BlockdevOptions bochs(@Nonnull BlockdevOptionsGenericFormat bochs) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.bochs;
		self.bochs = bochs;
		return self;
	}

	@Nonnull
	public static BlockdevOptions cloop(@Nonnull BlockdevOptionsGenericFormat cloop) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.cloop;
		self.cloop = cloop;
		return self;
	}

	@Nonnull
	public static BlockdevOptions cow(@Nonnull BlockdevOptionsGenericCOWFormat cow) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.cow;
		self.cow = cow;
		return self;
	}

	@Nonnull
	public static BlockdevOptions dmg(@Nonnull BlockdevOptionsGenericFormat dmg) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.dmg;
		self.dmg = dmg;
		return self;
	}

	@Nonnull
	public static BlockdevOptions parallels(@Nonnull BlockdevOptionsGenericFormat parallels) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.parallels;
		self.parallels = parallels;
		return self;
	}

	@Nonnull
	public static BlockdevOptions qcow(@Nonnull BlockdevOptionsGenericCOWFormat qcow) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.qcow;
		self.qcow = qcow;
		return self;
	}

	@Nonnull
	public static BlockdevOptions qcow2(@Nonnull BlockdevOptionsQcow2 qcow2) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.qcow2;
		self.qcow2 = qcow2;
		return self;
	}

	@Nonnull
	public static BlockdevOptions qed(@Nonnull BlockdevOptionsGenericCOWFormat qed) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.qed;
		self.qed = qed;
		return self;
	}

	@Nonnull
	public static BlockdevOptions raw(@Nonnull BlockdevOptionsGenericFormat raw) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.raw;
		self.raw = raw;
		return self;
	}

	@Nonnull
	public static BlockdevOptions vdi(@Nonnull BlockdevOptionsGenericFormat vdi) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.vdi;
		self.vdi = vdi;
		return self;
	}

	@Nonnull
	public static BlockdevOptions vhdx(@Nonnull BlockdevOptionsGenericFormat vhdx) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.vhdx;
		self.vhdx = vhdx;
		return self;
	}

	@Nonnull
	public static BlockdevOptions vmdk(@Nonnull BlockdevOptionsGenericCOWFormat vmdk) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.vmdk;
		self.vmdk = vmdk;
		return self;
	}

	@Nonnull
	public static BlockdevOptions vpc(@Nonnull BlockdevOptionsGenericFormat vpc) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.vpc;
		self.vpc = vpc;
		return self;
	}

	@Nonnull
	public static BlockdevOptions quorum(@Nonnull BlockdevOptionsQuorum quorum) {
		BlockdevOptions self = new BlockdevOptions();
		self.driver = BlockdevDriver.quorum;
		self.quorum = quorum;
		return self;
	}

	@Override
	public boolean isValidUnion() {
		int count = 0;
		if (file != null)
			count++;
		if (hostDevice != null)
			count++;
		if (hostCdrom != null)
			count++;
		if (hostFloppy != null)
			count++;
		if (http != null)
			count++;
		if (https != null)
			count++;
		if (ftp != null)
			count++;
		if (ftps != null)
			count++;
		if (tftp != null)
			count++;
		if (vvfat != null)
			count++;
		if (blkdebug != null)
			count++;
		if (blkverify != null)
			count++;
		if (bochs != null)
			count++;
		if (cloop != null)
			count++;
		if (cow != null)
			count++;
		if (dmg != null)
			count++;
		if (parallels != null)
			count++;
		if (qcow != null)
			count++;
		if (qcow2 != null)
			count++;
		if (qed != null)
			count++;
		if (raw != null)
			count++;
		if (vdi != null)
			count++;
		if (vhdx != null)
			count++;
		if (vmdk != null)
			count++;
		if (vpc != null)
			count++;
		if (quorum != null)
			count++;
		return (count == 1);
	}
}
