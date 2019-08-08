package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class Commander2019Edition extends ExpansionSet {

    private static final Commander2019Edition instance = new Commander2019Edition();

    public static Commander2019Edition getInstance() {
        return instance;
    }

    private Commander2019Edition() {
        super("Commander 2019 Edition", "C19", ExpansionSet.buildDate(2019, 8, 23), SetType.SUPPLEMENTAL);
        this.blockName = "Command Zone";

        cards.add(new SetCardInfo("Ainok Survivalist", 156, Rarity.COMMON, mage.cards.a.AinokSurvivalist.class));
        cards.add(new SetCardInfo("Angel of Sanctions", 61, Rarity.MYTHIC, mage.cards.a.AngelOfSanctions.class));
        cards.add(new SetCardInfo("Anje Falkenrath", 37, Rarity.MYTHIC, mage.cards.a.AnjeFalkenrath.class));
        cards.add(new SetCardInfo("Anje's Ravager", 22, Rarity.RARE, mage.cards.a.AnjesRavager.class));
        cards.add(new SetCardInfo("Apex Altisaur", 31, Rarity.RARE, mage.cards.a.ApexAltisaur.class));
        cards.add(new SetCardInfo("Armillary Sphere", 209, Rarity.COMMON, mage.cards.a.ArmillarySphere.class));
        cards.add(new SetCardInfo("Ash Barrens", 227, Rarity.COMMON, mage.cards.a.AshBarrens.class));
        cards.add(new SetCardInfo("Azorius Chancery", 228, Rarity.UNCOMMON, mage.cards.a.AzoriusChancery.class));
        cards.add(new SetCardInfo("Azorius Locket", 210, Rarity.COMMON, mage.cards.a.AzoriusLocket.class));
        cards.add(new SetCardInfo("Backdraft Hellkite", 23, Rarity.RARE, mage.cards.b.BackdraftHellkite.class));
        cards.add(new SetCardInfo("Bane of the Living", 104, Rarity.RARE, mage.cards.b.BaneOfTheLiving.class));
        cards.add(new SetCardInfo("Beast Within", 157, Rarity.UNCOMMON, mage.cards.b.BeastWithin.class));
        cards.add(new SetCardInfo("Big Game Hunter", 106, Rarity.UNCOMMON, mage.cards.b.BigGameHunter.class));
        cards.add(new SetCardInfo("Biomass Mutation", 187, Rarity.RARE, mage.cards.b.BiomassMutation.class));
        cards.add(new SetCardInfo("Bojuka Bog", 232, Rarity.COMMON, mage.cards.b.BojukaBog.class));
        cards.add(new SetCardInfo("Boros Garrison", 233, Rarity.COMMON, mage.cards.b.BorosGarrison.class));
        cards.add(new SetCardInfo("Boros Guildgate", 234, Rarity.COMMON, mage.cards.b.BorosGuildgate.class));
        cards.add(new SetCardInfo("Bounty of the Luxa", 189, Rarity.RARE, mage.cards.b.BountyOfTheLuxa.class));
        cards.add(new SetCardInfo("Burnished Hart", 211, Rarity.UNCOMMON, mage.cards.b.BurnishedHart.class));
        cards.add(new SetCardInfo("Chemister's Insight", 80, Rarity.UNCOMMON, mage.cards.c.ChemistersInsight.class));
        cards.add(new SetCardInfo("Chromeshell Crab", 81, Rarity.RARE, mage.cards.c.ChromeshellCrab.class));
        cards.add(new SetCardInfo("Cinder Glade", 236, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Clever Impersonator", 82, Rarity.MYTHIC, mage.cards.c.CleverImpersonator.class));
        cards.add(new SetCardInfo("Cliffside Rescuer", 1, Rarity.UNCOMMON, mage.cards.c.CliffsideRescuer.class));
        cards.add(new SetCardInfo("Command Tower", 237, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Insignia", 2, Rarity.RARE, mage.cards.c.CommandersInsignia.class));
        cards.add(new SetCardInfo("Commander's Sphere", 212, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Crackling Drake", 190, Rarity.UNCOMMON, mage.cards.c.CracklingDrake.class));
        cards.add(new SetCardInfo("Cultivate", 159, Rarity.COMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Darkwater Catacombs", 238, Rarity.RARE, mage.cards.d.DarkwaterCatacombs.class));
        cards.add(new SetCardInfo("Deathmist Raptor", 160, Rarity.MYTHIC, mage.cards.d.DeathmistRaptor.class));
        cards.add(new SetCardInfo("Deep Analysis", 83, Rarity.COMMON, mage.cards.d.DeepAnalysis.class));
        cards.add(new SetCardInfo("Den Protector", 161, Rarity.RARE, mage.cards.d.DenProtector.class));
        cards.add(new SetCardInfo("Desperate Ravings", 137, Rarity.UNCOMMON, mage.cards.d.DesperateRavings.class));
        cards.add(new SetCardInfo("Devil's Play", 138, Rarity.RARE, mage.cards.d.DevilsPlay.class));
        cards.add(new SetCardInfo("Dimir Aqueduct", 239, Rarity.UNCOMMON, mage.cards.d.DimirAqueduct.class));
        cards.add(new SetCardInfo("Divine Reckoning", 62, Rarity.RARE, mage.cards.d.DivineReckoning.class));
        cards.add(new SetCardInfo("Dockside Extortionist", 24, Rarity.RARE, mage.cards.d.DocksideExtortionist.class));
        cards.add(new SetCardInfo("Doomed Artisan", 3, Rarity.RARE, mage.cards.d.DoomedArtisan.class));
        cards.add(new SetCardInfo("Dusk // Dawn", 63, Rarity.RARE, mage.cards.d.DuskDawn.class));
        cards.add(new SetCardInfo("Dragonmaster Outcast", 139, Rarity.MYTHIC, mage.cards.d.DragonmasterOutcast.class));
        cards.add(new SetCardInfo("Echoing Truth", 84, Rarity.COMMON, mage.cards.e.EchoingTruth.class));
        cards.add(new SetCardInfo("Evolving Wilds", 241, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exotic Orchard", 242, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Explore", 164, Rarity.COMMON, mage.cards.e.Explore.class));
        cards.add(new SetCardInfo("Fact or Fiction", 85, Rarity.UNCOMMON, mage.cards.f.FactOrFiction.class));
        cards.add(new SetCardInfo("Faithless Looting", 140, Rarity.COMMON, mage.cards.f.FaithlessLooting.class));
        cards.add(new SetCardInfo("Farm // Market", 192, Rarity.UNCOMMON, mage.cards.f.FarmMarket.class));
        cards.add(new SetCardInfo("Farseek", 165, Rarity.COMMON, mage.cards.f.Farseek.class));
        cards.add(new SetCardInfo("Feldon of the Third Path", 141, Rarity.MYTHIC, mage.cards.f.FeldonOfTheThirdPath.class));
        cards.add(new SetCardInfo("Fervent Denial", 86, Rarity.UNCOMMON, mage.cards.f.FerventDenial.class));
        cards.add(new SetCardInfo("Forest", 300, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forgotten Cave", 243, Rarity.COMMON, mage.cards.f.ForgottenCave.class));
        cards.add(new SetCardInfo("Full Flowering", 32, Rarity.RARE, mage.cards.f.FullFlowering.class));
        cards.add(new SetCardInfo("Garruk, Primal Hunter", 167, Rarity.MYTHIC, mage.cards.g.GarrukPrimalHunter.class));
        cards.add(new SetCardInfo("Gerrard, Weatherlight Hero", 41, Rarity.RARE, mage.cards.g.GerrardWeatherlightHero.class));
        cards.add(new SetCardInfo("Geth, Lord of the Vault", 114, Rarity.MYTHIC, mage.cards.g.GethLordOfTheVault.class));
        cards.add(new SetCardInfo("Ghastly Conscription", 115, Rarity.MYTHIC, mage.cards.g.GhastlyConscription.class));
        cards.add(new SetCardInfo("Ghired's Belligerence", 25, Rarity.RARE, mage.cards.g.GhiredsBelligerence.class));
        cards.add(new SetCardInfo("Ghired, Conclave Exile", 42, Rarity.MYTHIC, mage.cards.g.GhiredConclaveExile.class));
        cards.add(new SetCardInfo("Ghostly Prison", 64, Rarity.UNCOMMON, mage.cards.g.GhostlyPrison.class));
        cards.add(new SetCardInfo("Golgari Guildgate", 247, Rarity.COMMON, mage.cards.g.GolgariGuildgate.class));
        cards.add(new SetCardInfo("Golgari Rot Farm", 248, Rarity.UNCOMMON, mage.cards.g.GolgariRotFarm.class));
        cards.add(new SetCardInfo("Great Oak Guardian", 170, Rarity.UNCOMMON, mage.cards.g.GreatOakGuardian.class));
        cards.add(new SetCardInfo("Grim Haruspex", 118, Rarity.RARE, mage.cards.g.GrimHaruspex.class));
        cards.add(new SetCardInfo("Grimoire of the Dead", 213, Rarity.MYTHIC, mage.cards.g.GrimoireOfTheDead.class));
        cards.add(new SetCardInfo("Grismold, the Dreadsower", 44, Rarity.RARE, mage.cards.g.GrismoldTheDreadsower.class));
        cards.add(new SetCardInfo("Growing Ranks", 193, Rarity.RARE, mage.cards.g.GrowingRanks.class));
        cards.add(new SetCardInfo("Guttersnipe", 145, Rarity.UNCOMMON, mage.cards.g.Guttersnipe.class));
        cards.add(new SetCardInfo("Hedonist's Trove", 119, Rarity.RARE, mage.cards.h.HedonistsTrove.class));
        cards.add(new SetCardInfo("Hex", 120, Rarity.RARE, mage.cards.h.Hex.class));
        cards.add(new SetCardInfo("Highland Lake", 251, Rarity.UNCOMMON, mage.cards.h.HighlandLake.class));
        cards.add(new SetCardInfo("Hooded Hydra", 172, Rarity.MYTHIC, mage.cards.h.HoodedHydra.class));
        cards.add(new SetCardInfo("Hour of Reckoning", 65, Rarity.RARE, mage.cards.h.HourOfReckoning.class));
        cards.add(new SetCardInfo("Icefeather Aven", 194, Rarity.UNCOMMON, mage.cards.i.IcefeatherAven.class));
        cards.add(new SetCardInfo("Idol of Oblivion", 55, Rarity.RARE, mage.cards.i.IdolOfOblivion.class));
        cards.add(new SetCardInfo("Ignite the Future", 27, Rarity.RARE, mage.cards.i.IgniteTheFuture.class));
        cards.add(new SetCardInfo("Increasing Devotion", 66, Rarity.RARE, mage.cards.i.IncreasingDevotion.class));
        cards.add(new SetCardInfo("Increasing Vengeance", 147, Rarity.RARE, mage.cards.i.IncreasingVengeance.class));
        cards.add(new SetCardInfo("Island", 291, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ixidron", 87, Rarity.RARE, mage.cards.i.Ixidron.class));
        cards.add(new SetCardInfo("Izzet Boilerworks", 252, Rarity.UNCOMMON, mage.cards.i.IzzetBoilerworks.class));
        cards.add(new SetCardInfo("Izzet Guildgate", 253, Rarity.COMMON, mage.cards.i.IzzetGuildgate.class));
        cards.add(new SetCardInfo("Izzet Locket", 215, Rarity.COMMON, mage.cards.i.IzzetLocket.class));
        cards.add(new SetCardInfo("Jace's Sanctum", 88, Rarity.RARE, mage.cards.j.JacesSanctum.class));
        cards.add(new SetCardInfo("Jungle Hollow", 254, Rarity.COMMON, mage.cards.j.JungleHollow.class));
        cards.add(new SetCardInfo("Kadena's Silencer", 8, Rarity.RARE, mage.cards.k.KadenasSilencer.class));
        cards.add(new SetCardInfo("Kadena, Slinking Sorcerer", 45, Rarity.MYTHIC, mage.cards.k.KadenaSlinkingSorcerer.class));
        cards.add(new SetCardInfo("Kheru Spellsnatcher", 89, Rarity.RARE, mage.cards.k.KheruSpellsnatcher.class));
        cards.add(new SetCardInfo("Leadership Vacuum", 9, Rarity.UNCOMMON, mage.cards.l.LeadershipVacuum.class));
        cards.add(new SetCardInfo("Lightning Greaves", 217, Rarity.UNCOMMON, mage.cards.l.LightningGreaves.class));
        cards.add(new SetCardInfo("Llanowar Wastes", 258, Rarity.RARE, mage.cards.l.LlanowarWastes.class));
        cards.add(new SetCardInfo("Magmaquake", 148, Rarity.RARE, mage.cards.m.Magmaquake.class));
        cards.add(new SetCardInfo("Mass Diminish", 10, Rarity.RARE, mage.cards.m.MassDiminish.class));
        cards.add(new SetCardInfo("Mimic Vat", 219, Rarity.RARE, mage.cards.m.MimicVat.class));
        cards.add(new SetCardInfo("Momentous Fall", 173, Rarity.RARE, mage.cards.m.MomentousFall.class));
        cards.add(new SetCardInfo("Mountain", 297, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Myriad Landscape", 261, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Mystic Monastery", 262, Rarity.UNCOMMON, mage.cards.m.MysticMonastery.class));
        cards.add(new SetCardInfo("Mystic Retrieval", 90, Rarity.UNCOMMON, mage.cards.m.MysticRetrieval.class));
        cards.add(new SetCardInfo("Nantuko Vigilante", 174, Rarity.COMMON, mage.cards.n.NantukoVigilante.class));
        cards.add(new SetCardInfo("Nightmare Unmaking", 20, Rarity.RARE, mage.cards.n.NightmareUnmaking.class));
        cards.add(new SetCardInfo("Ohran Frostfang", 33, Rarity.RARE, mage.cards.o.OhranFrostfang.class));
        cards.add(new SetCardInfo("Oona's Grace", 91, Rarity.COMMON, mage.cards.o.OonasGrace.class));
        cards.add(new SetCardInfo("Opulent Palace", 264, Rarity.UNCOMMON, mage.cards.o.OpulentPalace.class));
        cards.add(new SetCardInfo("Overwhelming Stampede", 175, Rarity.RARE, mage.cards.o.OverwhelmingStampede.class));
        cards.add(new SetCardInfo("Plains", 288, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Prairie Stream", 265, Rarity.RARE, mage.cards.p.PrairieStream.class));
        cards.add(new SetCardInfo("Pramikon, Sky Rampart", 47, Rarity.MYTHIC, mage.cards.p.PramikonSkyRampart.class));
        cards.add(new SetCardInfo("Prismatic Strands", 69, Rarity.COMMON, mage.cards.p.PrismaticStrands.class));
        cards.add(new SetCardInfo("Pristine Angel", 70, Rarity.MYTHIC, mage.cards.p.PristineAngel.class));
        cards.add(new SetCardInfo("Pristine Skywise", 196, Rarity.RARE, mage.cards.p.PristineSkywise.class));
        cards.add(new SetCardInfo("Purify the Grave", 71, Rarity.UNCOMMON, mage.cards.p.PurifyTheGrave.class));
        cards.add(new SetCardInfo("Putrefy", 197, Rarity.UNCOMMON, mage.cards.p.Putrefy.class));
        cards.add(new SetCardInfo("Ral Zarek", 198, Rarity.MYTHIC, mage.cards.r.RalZarek.class));
        cards.add(new SetCardInfo("Ray of Distortion", 72, Rarity.COMMON, mage.cards.r.RayOfDistortion.class));
        cards.add(new SetCardInfo("Reality Shift", 92, Rarity.UNCOMMON, mage.cards.r.RealityShift.class));
        cards.add(new SetCardInfo("Refuse // Cooperate", 199, Rarity.RARE, mage.cards.r.RefuseCooperate.class));
        cards.add(new SetCardInfo("Reliquary Tower", 268, Rarity.UNCOMMON, mage.cards.r.ReliquaryTower.class));
        cards.add(new SetCardInfo("River Kelpie", 93, Rarity.RARE, mage.cards.r.RiverKelpie.class));
        cards.add(new SetCardInfo("Road of Return", 34, Rarity.RARE, mage.cards.r.RoadOfReturn.class));
        cards.add(new SetCardInfo("Roc Egg", 73, Rarity.UNCOMMON, mage.cards.r.RocEgg.class));
        cards.add(new SetCardInfo("Rolling Temblor", 151, Rarity.UNCOMMON, mage.cards.r.RollingTemblor.class));
        cards.add(new SetCardInfo("Runic Repetition", 94, Rarity.UNCOMMON, mage.cards.r.RunicRepetition.class));
        cards.add(new SetCardInfo("Sagu Mauler", 200, Rarity.RARE, mage.cards.s.SaguMauler.class));
        cards.add(new SetCardInfo("Sakura-Tribe Elder", 177, Rarity.COMMON, mage.cards.s.SakuraTribeElder.class));
        cards.add(new SetCardInfo("Sanctum of Eternity", 59, Rarity.RARE, mage.cards.s.SanctumOfEternity.class));
        cards.add(new SetCardInfo("Scaretiller", 57, Rarity.COMMON, mage.cards.s.Scaretiller.class));
        cards.add(new SetCardInfo("Scroll of Fate", 58, Rarity.RARE, mage.cards.s.ScrollOfFate.class));
        cards.add(new SetCardInfo("Second Harvest", 178, Rarity.RARE, mage.cards.s.SecondHarvest.class));
        cards.add(new SetCardInfo("Secret Plans", 201, Rarity.UNCOMMON, mage.cards.s.SecretPlans.class));
        cards.add(new SetCardInfo("Secrets of the Dead", 95, Rarity.UNCOMMON, mage.cards.s.SecretsOfTheDead.class));
        cards.add(new SetCardInfo("Seedborn Muse", 179, Rarity.RARE, mage.cards.s.SeedbornMuse.class));
        cards.add(new SetCardInfo("Selesnya Eulogist", 35, Rarity.RARE, mage.cards.s.SelesnyaEulogist.class));
        cards.add(new SetCardInfo("Sevinne's Reclamation", 5, Rarity.RARE, mage.cards.s.SevinnesReclamation.class));
        cards.add(new SetCardInfo("Sevinne, the Chronoclasm", 49, Rarity.MYTHIC, mage.cards.s.SevinneTheChronoclasm.class));
        cards.add(new SetCardInfo("Shamanic Revelation", 180, Rarity.RARE, mage.cards.s.ShamanicRevelation.class));
        cards.add(new SetCardInfo("Shrine of the Forsaken Gods", 273, Rarity.RARE, mage.cards.s.ShrineOfTheForsakenGods.class));
        cards.add(new SetCardInfo("Silumgar Assassin", 128, Rarity.RARE, mage.cards.s.SilumgarAssassin.class));
        cards.add(new SetCardInfo("Simic Growth Chamber", 274, Rarity.UNCOMMON, mage.cards.s.SimicGrowthChamber.class));
        cards.add(new SetCardInfo("Simic Guildgate", 275, Rarity.COMMON, mage.cards.s.SimicGuildgate.class));
        cards.add(new SetCardInfo("Skinthinner", 129, Rarity.COMMON, mage.cards.s.Skinthinner.class));
        cards.add(new SetCardInfo("Sol Ring", 221, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Song of the Worldsoul", 6, Rarity.RARE, mage.cards.s.SongOfTheWorldsoul.class));
        cards.add(new SetCardInfo("Stone Quarry", 276, Rarity.UNCOMMON, mage.cards.s.StoneQuarry.class));
        cards.add(new SetCardInfo("Storm Herd", 75, Rarity.RARE, mage.cards.s.StormHerd.class));
        cards.add(new SetCardInfo("Stratus Dancer", 96, Rarity.RARE, mage.cards.s.StratusDancer.class));
        cards.add(new SetCardInfo("Strionic Resonator", 224, Rarity.RARE, mage.cards.s.StrionicResonator.class));
        cards.add(new SetCardInfo("Sultai Charm", 202, Rarity.UNCOMMON, mage.cards.s.SultaiCharm.class));
        cards.add(new SetCardInfo("Sun Titan", 76, Rarity.MYTHIC, mage.cards.s.SunTitan.class));
        cards.add(new SetCardInfo("Sungrass Prairie", 277, Rarity.RARE, mage.cards.s.SungrassPrairie.class));
        cards.add(new SetCardInfo("Sunken Hollow", 278, Rarity.RARE, mage.cards.s.SunkenHollow.class));
        cards.add(new SetCardInfo("Swamp", 294, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swiftwater Cliffs", 279, Rarity.COMMON, mage.cards.s.SwiftwaterCliffs.class));
        cards.add(new SetCardInfo("Talrand, Sky Summoner", 97, Rarity.RARE, mage.cards.t.TalrandSkySummoner.class));
        cards.add(new SetCardInfo("Tectonic Hellion", 29, Rarity.RARE, mage.cards.t.TectonicHellion.class));
        cards.add(new SetCardInfo("Temple of the False God", 280, Rarity.UNCOMMON, mage.cards.t.TempleOfTheFalseGod.class));
        cards.add(new SetCardInfo("Tempt with Discovery", 183, Rarity.RARE, mage.cards.t.TemptWithDiscovery.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 281, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Tezzeret's Gambit", 98, Rarity.UNCOMMON, mage.cards.t.TezzeretsGambit.class));
        cards.add(new SetCardInfo("Thalia's Geistcaller", 7, Rarity.RARE, mage.cards.t.ThaliasGeistcaller.class));
        cards.add(new SetCardInfo("Thelonite Hermit", 184, Rarity.RARE, mage.cards.t.TheloniteHermit.class));
        cards.add(new SetCardInfo("Thespian's Stage", 282, Rarity.RARE, mage.cards.t.ThespiansStage.class));
        cards.add(new SetCardInfo("Think Twice", 99, Rarity.COMMON, mage.cards.t.ThinkTwice.class));
        cards.add(new SetCardInfo("Thornwood Falls", 283, Rarity.COMMON, mage.cards.t.ThornwoodFalls.class));
        cards.add(new SetCardInfo("Thousand Winds", 100, Rarity.RARE, mage.cards.t.ThousandWinds.class));
        cards.add(new SetCardInfo("Thragtusk", 185, Rarity.RARE, mage.cards.t.Thragtusk.class));
        cards.add(new SetCardInfo("Thran Dynamo", 225, Rarity.UNCOMMON, mage.cards.t.ThranDynamo.class));
        cards.add(new SetCardInfo("Trail of Mystery", 186, Rarity.RARE, mage.cards.t.TrailOfMystery.class));
        cards.add(new SetCardInfo("Tranquil Cove", 284, Rarity.COMMON, mage.cards.t.TranquilCove.class));
        cards.add(new SetCardInfo("Trostani, Selesnya's Voice", 204, Rarity.MYTHIC, mage.cards.t.TrostaniSelesnyasVoice.class));
        cards.add(new SetCardInfo("Urban Evolution", 205, Rarity.UNCOMMON, mage.cards.u.UrbanEvolution.class));
        cards.add(new SetCardInfo("Vesuvan Shapeshifter", 101, Rarity.RARE, mage.cards.v.VesuvanShapeshifter.class));
        cards.add(new SetCardInfo("Voice of Many", 36, Rarity.UNCOMMON, mage.cards.v.VoiceOfMany.class));
        cards.add(new SetCardInfo("Volrath, the Shapestealer", 51, Rarity.MYTHIC, mage.cards.v.VolrathTheShapestealer.class));
        cards.add(new SetCardInfo("Vraska the Unseen", 207, Rarity.MYTHIC, mage.cards.v.VraskaTheUnseen.class));
        cards.add(new SetCardInfo("Willbender", 102, Rarity.UNCOMMON, mage.cards.w.Willbender.class));
        cards.add(new SetCardInfo("Wind-Scarred Crag", 285, Rarity.COMMON, mage.cards.w.WindScarredCrag.class));
        cards.add(new SetCardInfo("Woodland Stream", 286, Rarity.COMMON, mage.cards.w.WoodlandStream.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 287, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
        cards.add(new SetCardInfo("Zetalpa, Primal Dawn", 79, Rarity.RARE, mage.cards.z.ZetalpaPrimalDawn.class));
    }
}
