package moze_intel.projecte.gameObjs;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

public enum EnumRelayTier implements StringRepresentable {
	MK1("relay_mk1", 64, 262_144),
	MK2("relay_mk2", 256, 1_048_576),
	MK3("relay_mk3", 1024, 16_777_216);

	private final String name;
	private final long chargeRate;
	private final long storage;

	EnumRelayTier(String name, @Range(from = 0, to = Long.MAX_VALUE) long chargeRate, @Range(from = 1, to = Long.MAX_VALUE) long storage) {
		this.name = name;
		this.chargeRate = chargeRate;
		this.storage = storage;
	}

	@NotNull
	@Override
	public String getSerializedName() {
		return name;
	}

	@Range(from = 0, to = Long.MAX_VALUE)
	public long getChargeRate() {
		return chargeRate;
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