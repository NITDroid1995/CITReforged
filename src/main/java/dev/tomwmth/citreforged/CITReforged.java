//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dev.tomwmth.citreforged;

import dev.tomwmth.citreforged.cit.CITRegistry;
import dev.tomwmth.citreforged.config.CITResewnConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("citreforged")
public final class CITReforged {
    //public static final Logger LOGGER = LogManager.getLogger("CIT Reforged");
    public static Logger LOGGER;

    public CITReforged(FMLJavaModLoadingContext context) {
        LOGGER = LogManager.getLogger("citreforged");
        context.getModEventBus().addListener((ev) -> CITRegistry.registerAll());

    }

    public CITReforged() {
        LOGGER = LogManager.getLogger("citreforged");
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
    }

    public static void logWarning(String message, Object... params) {
        if (!CITResewnConfig.INSTANCE.mute_warns) {
            LOGGER.warn(message, params);
        }
    }

    public static void logError(String message, Object... params) {
        if (!CITResewnConfig.INSTANCE.mute_errors) {
            LOGGER.error(message, params);
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

        CITRegistry.registerAll();
    }
}
