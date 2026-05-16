package moze_intel.projecte.gameObjs;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

public enum EnumCollectorTier implements StringRepresentable {
	MK1("collector_mk1", 256, 16_384),
	MK2("collector_mk2", 1024, 32_768),
	MK3("collector_mk3", 4096, 65_536);

	private final String name;
	private final long genRate;
	private final long storage;

	EnumCollectorTier(String name, @Range(from = 0, to = Long.MAX_VALUE) long genRate, @Range(from = 1, to = Long.MAX_VALUE) long storage) {
		this.name = name;
		this.genRate = genRate;
		this.storage = storage;
	}

	@NotNull
	@Override
	public String getSerializedName() {
		return name;
	}

	@Range(from = 0, to = Long.MAX_VALUE)
	public long getGenRate() {
		return genRate;
	}

	@Range(from = 1, to = Long.MAX_VALUE)
	public long getStorage() {
		return storage;
	}

	@Override
	public String toString() {
		return getSerializedName();
	}
}