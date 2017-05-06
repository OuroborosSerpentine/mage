/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
*/

package mage.sets;

import mage.cards.CardGraphicInfo;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author loki
 */
public class RavnicaCityOfGuilds extends ExpansionSet {
    private static final RavnicaCityOfGuilds instance = new RavnicaCityOfGuilds();

    public static RavnicaCityOfGuilds getInstance() {
        return instance;
    }

    private RavnicaCityOfGuilds() {
        super("Ravnica: City of Guilds", "RAV", ExpansionSet.buildDate(2005, 9, 24), SetType.EXPANSION);
        this.blockName = "Ravnica";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Agrus Kos, Wojek Veteran", 190, Rarity.RARE, mage.cards.a.AgrusKosWojekVeteran.class));
        cards.add(new SetCardInfo("Auratouched Mage", 1, Rarity.UNCOMMON, mage.cards.a.AuratouchedMage.class));
        cards.add(new SetCardInfo("Autochthon Wurm", 191, Rarity.RARE, mage.cards.a.AutochthonWurm.class));
        cards.add(new SetCardInfo("Barbarian Riftcutter", 114, Rarity.COMMON, mage.cards.b.BarbarianRiftcutter.class));
        cards.add(new SetCardInfo("Bathe in Light", 2, Rarity.UNCOMMON, mage.cards.b.BatheInLight.class));
        cards.add(new SetCardInfo("Belltower Sphinx", 38, Rarity.UNCOMMON, mage.cards.b.BelltowerSphinx.class));
        cards.add(new SetCardInfo("Benevolent Ancestor", 3, Rarity.COMMON, mage.cards.b.BenevolentAncestor.class));
        cards.add(new SetCardInfo("Birds of Paradise", 153, Rarity.RARE, mage.cards.b.BirdsOfParadise.class));
        cards.add(new SetCardInfo("Blazing Archon", 4, Rarity.RARE, mage.cards.b.BlazingArchon.class));
        cards.add(new SetCardInfo("Blockbuster", 115, Rarity.UNCOMMON, mage.cards.b.Blockbuster.class));
        cards.add(new SetCardInfo("Blood Funnel", 77, Rarity.RARE, mage.cards.b.BloodFunnel.class));
        cards.add(new SetCardInfo("Bloodbond March", 192, Rarity.RARE, mage.cards.b.BloodbondMarch.class));
        cards.add(new SetCardInfo("Bloodletter Quill", 254, Rarity.RARE, mage.cards.b.BloodletterQuill.class));
        cards.add(new SetCardInfo("Boros Fury-Shield", 5, Rarity.COMMON, mage.cards.b.BorosFuryShield.class));
        cards.add(new SetCardInfo("Boros Garrison", 275, Rarity.COMMON, mage.cards.b.BorosGarrison.class));
        cards.add(new SetCardInfo("Boros Guildmage", 242, Rarity.UNCOMMON, mage.cards.b.BorosGuildmage.class));
        cards.add(new SetCardInfo("Boros Recruit", 243, Rarity.COMMON, mage.cards.b.BorosRecruit.class));
        cards.add(new SetCardInfo("Boros Signet", 255, Rarity.COMMON, mage.cards.b.BorosSignet.class));
        cards.add(new SetCardInfo("Boros Swiftblade", 193, Rarity.UNCOMMON, mage.cards.b.BorosSwiftblade.class));
        cards.add(new SetCardInfo("Bottled Cloister", 256, Rarity.RARE, mage.cards.b.BottledCloister.class));
        cards.add(new SetCardInfo("Brainspoil", 78, Rarity.COMMON, mage.cards.b.Brainspoil.class));
        cards.add(new SetCardInfo("Bramble Elemental", 154, Rarity.COMMON, mage.cards.b.BrambleElemental.class));
        cards.add(new SetCardInfo("Breath of Fury", 116, Rarity.RARE, mage.cards.b.BreathOfFury.class));
        cards.add(new SetCardInfo("Brightflame", 194, Rarity.RARE, mage.cards.b.Brightflame.class));
        cards.add(new SetCardInfo("Caregiver", 6, Rarity.COMMON, mage.cards.c.Caregiver.class));
        cards.add(new SetCardInfo("Carrion Howler", 79, Rarity.UNCOMMON, mage.cards.c.CarrionHowler.class));
        cards.add(new SetCardInfo("Carven Caryatid", 155, Rarity.UNCOMMON, mage.cards.c.CarvenCaryatid.class));
        cards.add(new SetCardInfo("Centaur Safeguard", 244, Rarity.COMMON, mage.cards.c.CentaurSafeguard.class));
        cards.add(new SetCardInfo("Cerulean Sphinx", 39, Rarity.RARE, mage.cards.c.CeruleanSphinx.class));
        cards.add(new SetCardInfo("Char", 117, Rarity.RARE, mage.cards.c.Char.class));
        cards.add(new SetCardInfo("Chord of Calling", 156, Rarity.RARE, mage.cards.c.ChordOfCalling.class));
        cards.add(new SetCardInfo("Chorus of the Conclave", 195, Rarity.RARE, mage.cards.c.ChorusOfTheConclave.class));
        cards.add(new SetCardInfo("Circu, Dimir Lobotomist", 196, Rarity.RARE, mage.cards.c.CircuDimirLobotomist.class));
        cards.add(new SetCardInfo("Civic Wayfinder", 157, Rarity.COMMON, mage.cards.c.CivicWayfinder.class));
        cards.add(new SetCardInfo("Cleansing Beam", 118, Rarity.UNCOMMON, mage.cards.c.CleansingBeam.class));
        cards.add(new SetCardInfo("Clinging Darkness", 80, Rarity.COMMON, mage.cards.c.ClingingDarkness.class));
        cards.add(new SetCardInfo("Cloudstone Curio", 257, Rarity.RARE, mage.cards.c.CloudstoneCurio.class));
        cards.add(new SetCardInfo("Clutch of the Undercity", 197, Rarity.UNCOMMON, mage.cards.c.ClutchOfTheUndercity.class));
        cards.add(new SetCardInfo("Coalhauler Swine", 119, Rarity.COMMON, mage.cards.c.CoalhaulerSwine.class));
        cards.add(new SetCardInfo("Compulsive Research", 40, Rarity.COMMON, mage.cards.c.CompulsiveResearch.class));
        cards.add(new SetCardInfo("Concerted Effort", 8, Rarity.RARE, mage.cards.c.ConcertedEffort.class));
        cards.add(new SetCardInfo("Conclave Equenaut", 9, Rarity.COMMON, mage.cards.c.ConclaveEquenaut.class));
        cards.add(new SetCardInfo("Conclave Phalanx", 10, Rarity.UNCOMMON, mage.cards.c.ConclavePhalanx.class));
        cards.add(new SetCardInfo("Conclave's Blessing", 11, Rarity.COMMON, mage.cards.c.ConclavesBlessing.class));
        cards.add(new SetCardInfo("Congregation at Dawn", 198, Rarity.UNCOMMON, mage.cards.c.CongregationAtDawn.class));
        cards.add(new SetCardInfo("Consult the Necrosages", 199, Rarity.COMMON, mage.cards.c.ConsultTheNecrosages.class));
        cards.add(new SetCardInfo("Convolute", 41, Rarity.COMMON, mage.cards.c.Convolute.class));
        cards.add(new SetCardInfo("Copy Enchantment", 42, Rarity.RARE, mage.cards.c.CopyEnchantment.class));
        cards.add(new SetCardInfo("Courier Hawk", 12, Rarity.COMMON, mage.cards.c.CourierHawk.class));
        cards.add(new SetCardInfo("Crown of Convergence", 258, Rarity.RARE, mage.cards.c.CrownOfConvergence.class));
        cards.add(new SetCardInfo("Cyclopean Snare", 259, Rarity.UNCOMMON, mage.cards.c.CyclopeanSnare.class));
        cards.add(new SetCardInfo("Darkblast", 82, Rarity.UNCOMMON, mage.cards.d.Darkblast.class));
        cards.add(new SetCardInfo("Dark Confidant", 81, Rarity.RARE, mage.cards.d.DarkConfidant.class));
        cards.add(new SetCardInfo("Dark Heart of the Wood", 200, Rarity.UNCOMMON, mage.cards.d.DarkHeartOfTheWood.class));
        cards.add(new SetCardInfo("Devouring Light", 13, Rarity.UNCOMMON, mage.cards.d.DevouringLight.class));
        cards.add(new SetCardInfo("Dimir Aqueduct", 276, Rarity.COMMON, mage.cards.d.DimirAqueduct.class));
        cards.add(new SetCardInfo("Dimir Cutpurse", 201, Rarity.RARE, mage.cards.d.DimirCutpurse.class));
        cards.add(new SetCardInfo("Dimir Doppelganger", 202, Rarity.RARE, mage.cards.d.DimirDoppelganger.class));
        cards.add(new SetCardInfo("Dimir Guildmage", 245, Rarity.UNCOMMON, mage.cards.d.DimirGuildmage.class));
        cards.add(new SetCardInfo("Dimir House Guard", 83, Rarity.COMMON, mage.cards.d.DimirHouseGuard.class));
        cards.add(new SetCardInfo("Dimir Infiltrator", 203, Rarity.COMMON, mage.cards.d.DimirInfiltrator.class));
        cards.add(new SetCardInfo("Dimir Machinations", 84, Rarity.UNCOMMON, mage.cards.d.DimirMachinations.class));
        cards.add(new SetCardInfo("Dimir Signet", 260, Rarity.COMMON, mage.cards.d.DimirSignet.class));
        cards.add(new SetCardInfo("Disembowel", 85, Rarity.COMMON, mage.cards.d.Disembowel.class));
        cards.add(new SetCardInfo("Divebomber Griffin", 14, Rarity.UNCOMMON, mage.cards.d.DivebomberGriffin.class));
        cards.add(new SetCardInfo("Dizzy Spell", 43, Rarity.COMMON, mage.cards.d.DizzySpell.class));
        cards.add(new SetCardInfo("Dogpile", 120, Rarity.COMMON, mage.cards.d.Dogpile.class));
        cards.add(new SetCardInfo("Doubling Season", 158, Rarity.RARE, mage.cards.d.DoublingSeason.class));
        cards.add(new SetCardInfo("Dowsing Shaman", 159, Rarity.UNCOMMON, mage.cards.d.DowsingShaman.class));
        cards.add(new SetCardInfo("Drake Familiar", 44, Rarity.COMMON, mage.cards.d.DrakeFamiliar.class));
        cards.add(new SetCardInfo("Dream Leash", 45, Rarity.RARE, mage.cards.d.DreamLeash.class));
        cards.add(new SetCardInfo("Drift of Phantasms", 46, Rarity.COMMON, mage.cards.d.DriftOfPhantasms.class));
        cards.add(new SetCardInfo("Dromad Purebred", 15, Rarity.COMMON, mage.cards.d.DromadPurebred.class));
        cards.add(new SetCardInfo("Drooling Groodion", 204, Rarity.UNCOMMON, mage.cards.d.DroolingGroodion.class));
        cards.add(new SetCardInfo("Dryad's Caress", 160, Rarity.COMMON, mage.cards.d.DryadsCaress.class));
        cards.add(new SetCardInfo("Duskmantle, House of Shadow", 277, Rarity.UNCOMMON, mage.cards.d.DuskmantleHouseOfShadow.class));
        cards.add(new SetCardInfo("Elves of Deep Shadow", 161, Rarity.COMMON, mage.cards.e.ElvesOfDeepShadow.class));
        cards.add(new SetCardInfo("Elvish Skysweeper", 162, Rarity.COMMON, mage.cards.e.ElvishSkysweeper.class));
        cards.add(new SetCardInfo("Empty the Catacombs", 86, Rarity.RARE, mage.cards.e.EmptyTheCatacombs.class));
        cards.add(new SetCardInfo("Ethereal Usher", 47, Rarity.UNCOMMON, mage.cards.e.EtherealUsher.class));
        cards.add(new SetCardInfo("Eye of the Storm", 48, Rarity.RARE, mage.cards.e.EyeOfTheStorm.class));
        cards.add(new SetCardInfo("Faith's Fetters", 16, Rarity.COMMON, mage.cards.f.FaithsFetters.class));
        cards.add(new SetCardInfo("Farseek", 163, Rarity.COMMON, mage.cards.f.Farseek.class));
	cards.add(new SetCardInfo("Festival of the Guildpact", 17, Rarity.UNCOMMON, mage.cards.f.FestivalOfTheGuildpact.class));
        cards.add(new SetCardInfo("Fiery Conclusion", 122, Rarity.COMMON, mage.cards.f.FieryConclusion.class));
        cards.add(new SetCardInfo("Firemane Angel", 205, Rarity.RARE, mage.cards.f.FiremaneAngel.class));
        cards.add(new SetCardInfo("Fists of Ironwood", 164, Rarity.COMMON, mage.cards.f.FistsOfIronwood.class));
        cards.add(new SetCardInfo("Flame Fusillade", 123, Rarity.RARE, mage.cards.f.FlameFusillade.class));
        cards.add(new SetCardInfo("Flame-Kin Zealot", 206, Rarity.UNCOMMON, mage.cards.f.FlameKinZealot.class));
        cards.add(new SetCardInfo("Flash Conscription", 124, Rarity.UNCOMMON, mage.cards.f.FlashConscription.class));
        cards.add(new SetCardInfo("Flickerform", 18, Rarity.RARE, mage.cards.f.Flickerform.class));
        cards.add(new SetCardInfo("Flight of Fancy", 49, Rarity.COMMON, mage.cards.f.FlightOfFancy.class));
        cards.add(new SetCardInfo("Flow of Ideas", 50, Rarity.UNCOMMON, mage.cards.f.FlowOfIdeas.class));
        cards.add(new SetCardInfo("Followed Footsteps", 51, Rarity.RARE, mage.cards.f.FollowedFootsteps.class));
        cards.add(new SetCardInfo("Forest", 303, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 304, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 305, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 306, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Frenzied Goblin", 125, Rarity.UNCOMMON, mage.cards.f.FrenziedGoblin.class));
        cards.add(new SetCardInfo("Galvanic Arc", 126, Rarity.COMMON, mage.cards.g.GalvanicArc.class));
        cards.add(new SetCardInfo("Gate Hound", 19, Rarity.COMMON, mage.cards.g.GateHound.class));
        cards.add(new SetCardInfo("Gather Courage", 165, Rarity.COMMON, mage.cards.g.GatherCourage.class));
        cards.add(new SetCardInfo("Ghosts of the Innocent", 20, Rarity.RARE, mage.cards.g.GhostsOfTheInnocent.class));
        cards.add(new SetCardInfo("Glare of Subdual", 207, Rarity.RARE, mage.cards.g.GlareOfSubdual.class));
        cards.add(new SetCardInfo("Glass Golem", 261, Rarity.UNCOMMON, mage.cards.g.GlassGolem.class));
        cards.add(new SetCardInfo("Gleancrawler", 247, Rarity.RARE, mage.cards.g.Gleancrawler.class));
        cards.add(new SetCardInfo("Glimpse the Unthinkable", 208, Rarity.RARE, mage.cards.g.GlimpseTheUnthinkable.class));
        cards.add(new SetCardInfo("Goblin Fire Fiend", 127, Rarity.COMMON, mage.cards.g.GoblinFireFiend.class));
        cards.add(new SetCardInfo("Goblin Spelunkers", 128, Rarity.COMMON, mage.cards.g.GoblinSpelunkers.class));
        cards.add(new SetCardInfo("Golgari Brownscale", 166, Rarity.COMMON, mage.cards.g.GolgariBrownscale.class));
        cards.add(new SetCardInfo("Golgari Germination", 209, Rarity.UNCOMMON, mage.cards.g.GolgariGermination.class));
        cards.add(new SetCardInfo("Golgari Grave-Troll", 167, Rarity.RARE, mage.cards.g.GolgariGraveTroll.class));
        cards.add(new SetCardInfo("Golgari Guildmage", 248, Rarity.UNCOMMON, mage.cards.g.GolgariGuildmage.class));
        cards.add(new SetCardInfo("Golgari Rot Farm", 278, Rarity.COMMON, mage.cards.g.GolgariRotFarm.class));
        cards.add(new SetCardInfo("Golgari Rotwurm", 210, Rarity.COMMON, mage.cards.g.GolgariRotwurm.class));
        cards.add(new SetCardInfo("Golgari Signet", 262, Rarity.COMMON, mage.cards.g.GolgariSignet.class));
        cards.add(new SetCardInfo("Golgari Thug", 87, Rarity.UNCOMMON, mage.cards.g.GolgariThug.class));
        cards.add(new SetCardInfo("Goliath Spider", 168, Rarity.UNCOMMON, mage.cards.g.GoliathSpider.class));
        cards.add(new SetCardInfo("Grave-Shell Scarab", 211, Rarity.RARE, mage.cards.g.GraveShellScarab.class));
        cards.add(new SetCardInfo("Grayscaled Gharial", 52, Rarity.COMMON, mage.cards.g.GrayscaledGharial.class));
        cards.add(new SetCardInfo("Greater Forgeling", 129, Rarity.UNCOMMON, mage.cards.g.GreaterForgeling.class));
        cards.add(new SetCardInfo("Greater Mossdog", 169, Rarity.COMMON, mage.cards.g.GreaterMossdog.class));
        cards.add(new SetCardInfo("Grozoth", 53, Rarity.RARE, mage.cards.g.Grozoth.class));
        cards.add(new SetCardInfo("Guardian of Vitu-Ghazi", 212, Rarity.COMMON, mage.cards.g.GuardianOfVituGhazi.class));
        cards.add(new SetCardInfo("Halcyon Glaze", 54, Rarity.UNCOMMON, mage.cards.h.HalcyonGlaze.class));
        cards.add(new SetCardInfo("Hammerfist Giant", 130, Rarity.RARE, mage.cards.h.HammerfistGiant.class));
        cards.add(new SetCardInfo("Helldozer", 88, Rarity.RARE, mage.cards.h.Helldozer.class));
        cards.add(new SetCardInfo("Hex", 89, Rarity.RARE, mage.cards.h.Hex.class));
        cards.add(new SetCardInfo("Hour of Reckoning", 21, Rarity.RARE, mage.cards.h.HourOfReckoning.class));
        cards.add(new SetCardInfo("Hunted Dragon", 131, Rarity.RARE, mage.cards.h.HuntedDragon.class));
        cards.add(new SetCardInfo("Hunted Horror", 90, Rarity.RARE, mage.cards.h.HuntedHorror.class));
        cards.add(new SetCardInfo("Hunted Lammasu", 22, Rarity.RARE, mage.cards.h.HuntedLammasu.class));
        cards.add(new SetCardInfo("Hunted Phantasm", 55, Rarity.RARE, mage.cards.h.HuntedPhantasm.class));
        cards.add(new SetCardInfo("Hunted Troll", 170, Rarity.RARE, mage.cards.h.HuntedTroll.class));
        cards.add(new SetCardInfo("Incite Hysteria", 132, Rarity.COMMON, mage.cards.i.InciteHysteria.class));
        cards.add(new SetCardInfo("Induce Paranoia", 56, Rarity.COMMON, mage.cards.i.InduceParanoia.class));
        cards.add(new SetCardInfo("Infectious Host", 91, Rarity.COMMON, mage.cards.i.InfectiousHost.class));
        cards.add(new SetCardInfo("Island", 291, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 292, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 293, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 294, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Ivy Dancer", 171, Rarity.UNCOMMON, mage.cards.i.IvyDancer.class));
        cards.add(new SetCardInfo("Junktroller", 264, Rarity.UNCOMMON, mage.cards.j.Junktroller.class));
        cards.add(new SetCardInfo("Keening Banshee", 92, Rarity.UNCOMMON, mage.cards.k.KeeningBanshee.class));
        cards.add(new SetCardInfo("Last Gasp", 93, Rarity.COMMON, mage.cards.l.LastGasp.class));
        cards.add(new SetCardInfo("Leashling", 265, Rarity.UNCOMMON, mage.cards.l.Leashling.class));
        cards.add(new SetCardInfo("Leave No Trace", 23, Rarity.COMMON, mage.cards.l.LeaveNoTrace.class));
        cards.add(new SetCardInfo("Life from the Loam", 172, Rarity.RARE, mage.cards.l.LifeFromTheLoam.class));
        cards.add(new SetCardInfo("Lightning Helix", 213, Rarity.UNCOMMON, mage.cards.l.LightningHelix.class));
        cards.add(new SetCardInfo("Light of Sanction", 24, Rarity.RARE, mage.cards.l.LightOfSanction.class));
        cards.add(new SetCardInfo("Lore Broker", 57, Rarity.UNCOMMON, mage.cards.l.LoreBroker.class));
        cards.add(new SetCardInfo("Loxodon Gatekeeper", 25, Rarity.RARE, mage.cards.l.LoxodonGatekeeper.class));
        cards.add(new SetCardInfo("Loxodon Hierarch", 214, Rarity.RARE, mage.cards.l.LoxodonHierarch.class));
        cards.add(new SetCardInfo("Lurking Informant", 249, Rarity.COMMON, mage.cards.l.LurkingInformant.class));
        cards.add(new SetCardInfo("Mausoleum Turnkey", 94, Rarity.UNCOMMON, mage.cards.m.MausoleumTurnkey.class));
        cards.add(new SetCardInfo("Mindleech Mass", 215, Rarity.RARE, mage.cards.m.MindleechMass.class));
        cards.add(new SetCardInfo("Mindmoil", 135, Rarity.RARE, mage.cards.m.Mindmoil.class));
        cards.add(new SetCardInfo("Mnemonic Nexus", 59, Rarity.UNCOMMON, mage.cards.m.MnemonicNexus.class));
        cards.add(new SetCardInfo("Moldervine Cloak", 173, Rarity.UNCOMMON, mage.cards.m.MoldervineCloak.class));
        cards.add(new SetCardInfo("Molten Sentry", 136, Rarity.RARE, mage.cards.m.MoltenSentry.class));
        cards.add(new SetCardInfo("Moonlight Bargain", 95, Rarity.RARE, mage.cards.m.MoonlightBargain.class));
        cards.add(new SetCardInfo("Moroii", 216, Rarity.UNCOMMON, mage.cards.m.Moroii.class));
        cards.add(new SetCardInfo("Mortipede", 96, Rarity.COMMON, mage.cards.m.Mortipede.class));
        cards.add(new SetCardInfo("Mountain", 299, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 300, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 301, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 302, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Muddle the Mixture", 60, Rarity.COMMON, mage.cards.m.MuddleTheMixture.class));
        cards.add(new SetCardInfo("Necromantic Thirst", 97, Rarity.COMMON, mage.cards.n.NecromanticThirst.class));
        cards.add(new SetCardInfo("Necroplasm", 98, Rarity.RARE, mage.cards.n.Necroplasm.class));
        cards.add(new SetCardInfo("Netherborn Phalanx", 99, Rarity.UNCOMMON, mage.cards.n.NetherbornPhalanx.class));
        cards.add(new SetCardInfo("Nightguard Patrol", 26, Rarity.COMMON, mage.cards.n.NightguardPatrol.class));
        cards.add(new SetCardInfo("Nightmare Void", 100, Rarity.UNCOMMON, mage.cards.n.NightmareVoid.class));
        cards.add(new SetCardInfo("Nullmage Shepherd", 174, Rarity.UNCOMMON, mage.cards.n.NullmageShepherd.class));
        cards.add(new SetCardInfo("Oathsworn Giant", 27, Rarity.UNCOMMON, mage.cards.o.OathswornGiant.class));
        cards.add(new SetCardInfo("Ordruun Commando", 137, Rarity.COMMON, mage.cards.o.OrdruunCommando.class));
        cards.add(new SetCardInfo("Overgrown Tomb", 279, Rarity.RARE, mage.cards.o.OvergrownTomb.class));
        cards.add(new SetCardInfo("Overwhelm", 175, Rarity.UNCOMMON, mage.cards.o.Overwhelm.class));
        cards.add(new SetCardInfo("Pariah's Shield", 267, Rarity.RARE, mage.cards.p.PariahsShield.class));
        cards.add(new SetCardInfo("Peel from Reality", 61, Rarity.COMMON, mage.cards.p.PeelFromReality.class));
        cards.add(new SetCardInfo("Peregrine Mask", 268, Rarity.UNCOMMON, mage.cards.p.PeregrineMask.class));
        cards.add(new SetCardInfo("Perilous Forays", 176, Rarity.UNCOMMON, mage.cards.p.PerilousForays.class));
        cards.add(new SetCardInfo("Perplex", 217, Rarity.COMMON, mage.cards.p.Perplex.class));
        cards.add(new SetCardInfo("Phytohydra", 218, Rarity.RARE, mage.cards.p.Phytohydra.class));
        cards.add(new SetCardInfo("Plague Boiler", 269, Rarity.RARE, mage.cards.p.PlagueBoiler.class));
        cards.add(new SetCardInfo("Plains", 287, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 288, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 289, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 290, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Pollenbright Wings", 219, Rarity.UNCOMMON, mage.cards.p.PollenbrightWings.class));
        cards.add(new SetCardInfo("Primordial Sage", 177, Rarity.RARE, mage.cards.p.PrimordialSage.class));
        cards.add(new SetCardInfo("Privileged Position", 251, Rarity.RARE, mage.cards.p.PrivilegedPosition.class));
        cards.add(new SetCardInfo("Psychic Drain", 220, Rarity.UNCOMMON, mage.cards.p.PsychicDrain.class));
        cards.add(new SetCardInfo("Putrefy", 221, Rarity.UNCOMMON, mage.cards.p.Putrefy.class));
        cards.add(new SetCardInfo("Quickchange", 62, Rarity.COMMON, mage.cards.q.Quickchange.class));
        cards.add(new SetCardInfo("Rain of Embers", 138, Rarity.COMMON, mage.cards.r.RainOfEmbers.class));
        cards.add(new SetCardInfo("Rally the Righteous", 222, Rarity.COMMON, mage.cards.r.RallyTheRighteous.class));
        cards.add(new SetCardInfo("Razia's Purification", 224, Rarity.RARE, mage.cards.r.RaziasPurification.class));
        cards.add(new SetCardInfo("Razia, Boros Archangel", 223, Rarity.RARE, mage.cards.r.RaziaBorosArchangel.class));
        cards.add(new SetCardInfo("Recollect", 178, Rarity.UNCOMMON, mage.cards.r.Recollect.class));
        cards.add(new SetCardInfo("Remand", 63, Rarity.UNCOMMON, mage.cards.r.Remand.class));
        cards.add(new SetCardInfo("Reroute", 139, Rarity.UNCOMMON, mage.cards.r.Reroute.class));
        cards.add(new SetCardInfo("Ribbons of Night", 101, Rarity.UNCOMMON, mage.cards.r.RibbonsOfNight.class));
        cards.add(new SetCardInfo("Rolling Spoil", 179, Rarity.UNCOMMON, mage.cards.r.RollingSpoil.class));
        cards.add(new SetCardInfo("Roofstalker Wight", 102, Rarity.COMMON, mage.cards.r.RoofstalkerWight.class));
        cards.add(new SetCardInfo("Root-Kin Ally", 180, Rarity.UNCOMMON, mage.cards.r.RootKinAlly.class));
        cards.add(new SetCardInfo("Sabertooth Alley Cat", 140, Rarity.COMMON, mage.cards.s.SabertoothAlleyCat.class));
        cards.add(new SetCardInfo("Sacred Foundry", 280, Rarity.RARE, mage.cards.s.SacredFoundry.class));
        cards.add(new SetCardInfo("Sadistic Augermage", 103, Rarity.COMMON, mage.cards.s.SadisticAugermage.class));
        cards.add(new SetCardInfo("Sandsower", 28, Rarity.UNCOMMON, mage.cards.s.Sandsower.class));
        cards.add(new SetCardInfo("Savra, Queen of the Golgari", 225, Rarity.RARE, mage.cards.s.SavraQueenOfTheGolgari.class));
        cards.add(new SetCardInfo("Scatter the Seeds", 181, Rarity.COMMON, mage.cards.s.ScatterTheSeeds.class));
        cards.add(new SetCardInfo("Screeching Griffin", 29, Rarity.COMMON, mage.cards.s.ScreechingGriffin.class));
        cards.add(new SetCardInfo("Scion of the Wild", 182, Rarity.RARE, mage.cards.s.ScionOfTheWild.class));
        cards.add(new SetCardInfo("Searing Meditation", 226, Rarity.RARE, mage.cards.s.SearingMeditation.class));
        cards.add(new SetCardInfo("Seed Spark", 30, Rarity.UNCOMMON, mage.cards.s.SeedSpark.class));
        cards.add(new SetCardInfo("Seeds of Strength", 227, Rarity.COMMON, mage.cards.s.SeedsOfStrength.class));
        cards.add(new SetCardInfo("Seismic Spike", 141, Rarity.COMMON, mage.cards.s.SeismicSpike.class));
        cards.add(new SetCardInfo("Selesnya Evangel", 228, Rarity.COMMON, mage.cards.s.SelesnyaEvangel.class));
        cards.add(new SetCardInfo("Selesnya Guildmage", 252, Rarity.UNCOMMON, mage.cards.s.SelesnyaGuildmage.class));
        cards.add(new SetCardInfo("Selesnya Sagittars", 229, Rarity.UNCOMMON, mage.cards.s.SelesnyaSagittars.class));
        cards.add(new SetCardInfo("Selesnya Sanctuary", 281, Rarity.COMMON, mage.cards.s.SelesnyaSanctuary.class));
        cards.add(new SetCardInfo("Selesnya Signet", 270, Rarity.COMMON, mage.cards.s.SelesnyaSignet.class));
        cards.add(new SetCardInfo("Sell-Sword Brute", 142, Rarity.COMMON, mage.cards.s.SellSwordBrute.class));
        cards.add(new SetCardInfo("Sewerdreg", 104, Rarity.COMMON, mage.cards.s.Sewerdreg.class));
        cards.add(new SetCardInfo("Shadow of Doubt", 253, Rarity.RARE, mage.cards.s.ShadowOfDoubt.class));
        cards.add(new SetCardInfo("Shambling Shell", 230, Rarity.COMMON, mage.cards.s.ShamblingShell.class));
        cards.add(new SetCardInfo("Shred Memory", 105, Rarity.COMMON, mage.cards.s.ShredMemory.class));
        cards.add(new SetCardInfo("Siege Wurm", 183, Rarity.COMMON, mage.cards.s.SiegeWurm.class));
        cards.add(new SetCardInfo("Sins of the Past", 106, Rarity.RARE, mage.cards.s.SinsOfThePast.class));
        cards.add(new SetCardInfo("Sisters of Stone Death", 231, Rarity.RARE, mage.cards.s.SistersOfStoneDeath.class));
        cards.add(new SetCardInfo("Skyknight Legionnaire", 232, Rarity.COMMON, mage.cards.s.SkyknightLegionnaire.class));
        cards.add(new SetCardInfo("Smash", 143, Rarity.COMMON, mage.cards.s.Smash.class));
        cards.add(new SetCardInfo("Snapping Drake", 64, Rarity.COMMON, mage.cards.s.SnappingDrake.class));
        cards.add(new SetCardInfo("Sparkmage Apprentice", 144, Rarity.COMMON, mage.cards.s.SparkmageApprentice.class));
        cards.add(new SetCardInfo("Spectral Searchlight", 271, Rarity.UNCOMMON, mage.cards.s.SpectralSearchlight.class));
        cards.add(new SetCardInfo("Stasis Cell", 66, Rarity.COMMON, mage.cards.s.StasisCell.class));
        cards.add(new SetCardInfo("Stinkweed Imp", 107, Rarity.COMMON, mage.cards.s.StinkweedImp.class));
        cards.add(new SetCardInfo("Stone-Seeder Hierophant", 184, Rarity.COMMON, mage.cards.s.StoneSeederHierophant.class));
        cards.add(new SetCardInfo("Stoneshaker Shaman", 145, Rarity.UNCOMMON, mage.cards.s.StoneshakerShaman.class));
        cards.add(new SetCardInfo("Strands of Undeath", 108, Rarity.COMMON, mage.cards.s.StrandsOfUndeath.class));
        cards.add(new SetCardInfo("Sundering Vitae", 185, Rarity.COMMON, mage.cards.s.SunderingVitae.class));
        cards.add(new SetCardInfo("Sunforger", 272, Rarity.RARE, mage.cards.s.Sunforger.class));
        cards.add(new SetCardInfo("Sunhome Enforcer", 233, Rarity.UNCOMMON, mage.cards.s.SunhomeEnforcer.class));
        cards.add(new SetCardInfo("Sunhome, Fortress of the Legion", 282, Rarity.UNCOMMON, mage.cards.s.SunhomeFortressOfTheLegion.class));
        cards.add(new SetCardInfo("Suppression Field", 31, Rarity.UNCOMMON, mage.cards.s.SuppressionField.class));
        cards.add(new SetCardInfo("Surge of Zeal", 146, Rarity.COMMON, mage.cards.s.SurgeOfZeal.class));
        cards.add(new SetCardInfo("Surveilling Sprite", 67, Rarity.COMMON, mage.cards.s.SurveillingSprite.class));
        cards.add(new SetCardInfo("Svogthos, the Restless Tomb", 283, Rarity.UNCOMMON, mage.cards.s.SvogthosTheRestlessTomb.class));
        cards.add(new SetCardInfo("Swamp", 295, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 296, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 297, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 298, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Szadek, Lord of Secrets", 234, Rarity.RARE, mage.cards.s.SzadekLordOfSecrets.class));
        cards.add(new SetCardInfo("Tattered Drake", 68, Rarity.COMMON, mage.cards.t.TatteredDrake.class));
        cards.add(new SetCardInfo("Telling Time", 69, Rarity.UNCOMMON, mage.cards.t.TellingTime.class));
        cards.add(new SetCardInfo("Temple Garden", 284, Rarity.RARE, mage.cards.t.TempleGarden.class));
        cards.add(new SetCardInfo("Terraformer", 70, Rarity.COMMON, mage.cards.t.Terraformer.class));
        cards.add(new SetCardInfo("Terrarion", 273, Rarity.COMMON, mage.cards.t.Terrarion.class));
        cards.add(new SetCardInfo("Thoughtpicker Witch", 109, Rarity.COMMON, mage.cards.t.ThoughtpickerWitch.class));
        cards.add(new SetCardInfo("Three Dreams", 32, Rarity.RARE, mage.cards.t.ThreeDreams.class));
        cards.add(new SetCardInfo("Thundersong Trumpeter", 235, Rarity.COMMON, mage.cards.t.ThundersongTrumpeter.class));
        cards.add(new SetCardInfo("Tidewater Minion", 71, Rarity.COMMON, mage.cards.t.TidewaterMinion.class));
        cards.add(new SetCardInfo("Tolsimir Wolfblood", 236, Rarity.RARE, mage.cards.t.TolsimirWolfblood.class));
        cards.add(new SetCardInfo("Torpid Moloch", 147, Rarity.COMMON, mage.cards.t.TorpidMoloch.class));
        cards.add(new SetCardInfo("Transluminant", 186, Rarity.COMMON, mage.cards.t.Transluminant.class));
        cards.add(new SetCardInfo("Tunnel Vision", 72, Rarity.RARE, mage.cards.t.TunnelVision.class));
        cards.add(new SetCardInfo("Twilight Drover", 33, Rarity.RARE, mage.cards.t.TwilightDrover.class));
        cards.add(new SetCardInfo("Twisted Justice", 237, Rarity.UNCOMMON, mage.cards.t.TwistedJustice.class));
        cards.add(new SetCardInfo("Undercity Shade", 110, Rarity.UNCOMMON, mage.cards.u.UndercityShade.class));
        cards.add(new SetCardInfo("Ursapine", 188, Rarity.RARE, mage.cards.u.Ursapine.class));
        cards.add(new SetCardInfo("Vedalken Dismisser", 73, Rarity.COMMON, mage.cards.v.VedalkenDismisser.class));
        cards.add(new SetCardInfo("Vedalken Entrancer", 74, Rarity.COMMON, mage.cards.v.VedalkenEntrancer.class));
        cards.add(new SetCardInfo("Veteran Armorer", 34, Rarity.COMMON, mage.cards.v.VeteranArmorer.class));
        cards.add(new SetCardInfo("Viashino Fangtail", 148, Rarity.COMMON, mage.cards.v.ViashinoFangtail.class));
        cards.add(new SetCardInfo("Viashino Slasher", 149, Rarity.COMMON, mage.cards.v.ViashinoSlasher.class));
        cards.add(new SetCardInfo("Vigor Mortis", 111, Rarity.UNCOMMON, mage.cards.v.VigorMortis.class));
        cards.add(new SetCardInfo("Vindictive Mob", 112, Rarity.UNCOMMON, mage.cards.v.VindictiveMob.class));
        cards.add(new SetCardInfo("Vinelasher Kudzu", 189, Rarity.RARE, mage.cards.v.VinelasherKudzu.class));
        cards.add(new SetCardInfo("Vitu-Ghazi, the City-Tree", 285, Rarity.UNCOMMON, mage.cards.v.VituGhaziTheCityTree.class));
        cards.add(new SetCardInfo("Votary of the Conclave", 35, Rarity.COMMON, mage.cards.v.VotaryOfTheConclave.class));
        cards.add(new SetCardInfo("Voyager Staff", 274, Rarity.UNCOMMON, mage.cards.v.VoyagerStaff.class));
        cards.add(new SetCardInfo("Vulturous Zombie", 238, Rarity.RARE, mage.cards.v.VulturousZombie.class));
        cards.add(new SetCardInfo("Warp World", 150, Rarity.RARE, mage.cards.w.WarpWorld.class));
        cards.add(new SetCardInfo("War-Torch Goblin", 151, Rarity.COMMON, mage.cards.w.WarTorchGoblin.class));
        cards.add(new SetCardInfo("Watchwolf", 239, Rarity.UNCOMMON, mage.cards.w.Watchwolf.class));
        cards.add(new SetCardInfo("Watery Grave", 286, Rarity.RARE, mage.cards.w.WateryGrave.class));
        cards.add(new SetCardInfo("Wizened Snitches", 75, Rarity.UNCOMMON, mage.cards.w.WizenedSnitches.class));
        cards.add(new SetCardInfo("Woebringer Demon", 113, Rarity.RARE, mage.cards.w.WoebringerDemon.class));
        cards.add(new SetCardInfo("Wojek Apothecary", 36, Rarity.UNCOMMON, mage.cards.w.WojekApothecary.class));
        cards.add(new SetCardInfo("Wojek Embermage", 152, Rarity.UNCOMMON, mage.cards.w.WojekEmbermage.class));
        cards.add(new SetCardInfo("Wojek Siren", 37, Rarity.COMMON, mage.cards.w.WojekSiren.class));
        cards.add(new SetCardInfo("Woodwraith Strangler", 241, Rarity.COMMON, mage.cards.w.WoodwraithStrangler.class));
        cards.add(new SetCardInfo("Zephyr Spirit", 76, Rarity.COMMON, mage.cards.z.ZephyrSpirit.class));
    }
}
