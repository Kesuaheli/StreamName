package de.kesuaheli.streamname.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
  @Inject(method = "getName", at = @At("RETURN"), cancellable = true)
  public void getName(CallbackInfoReturnable<Text> cir) {
    cir.setReturnValue(
      Text.empty()
          .append(Text.literal("⬤")
            .styled(style -> style.withColor(Formatting.RED))
          )
        .append(ScreenTexts.SPACE)
        .append(cir.getReturnValue())
    );
  }
}
