package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=TransactionAction, data={blockdev-snapshot-sync=BlockdevSnapshot, drive-backup=DriveBackup, abort=Abort, blockdev-snapshot-internal-sync=BlockdevSnapshotInternal}, innerTypes=null, fields=null}
public class TransactionAction extends QApiUnion {
	@SerializedName("blockdev-snapshot-sync")
	@Nonnull public BlockdevSnapshot blockdevSnapshotSync;
	@SerializedName("drive-backup")
	@Nonnull public DriveBackup driveBackup;
	@SerializedName("abort")
	@Nonnull public Abort abort;
	@SerializedName("blockdev-snapshot-internal-sync")
	@Nonnull public BlockdevSnapshotInternal blockdevSnapshotInternalSync;

	@Override
	public boolean isUnion() {
		int count = 0;
		if (blockdevSnapshotSync != null)
			count++;
		if (driveBackup != null)
			count++;
		if (abort != null)
			count++;
		if (blockdevSnapshotInternalSync != null)
			count++;
		return (count == 1);
	}
}
