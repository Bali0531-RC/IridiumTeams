package com.iridium.iridiumteams.configs;

public class Messages {
    public String reloaded;
    public String noPermission;
    public String mustBeAPlayer;
    public String notAPlayer;
    public String unknownCommand;
    public String helpCommandHeader;
    public String helpCommandFiller;
    public String helpCommandMessage;
    public String helpCommandFooter;
    public String helpCommandPreviousPage;
    public String helpCommandNextPage;
    public String helpCommandNextPageHover;
    public String helpCommandPreviousPageHover;
    public String alreadyHaveTeam;
    public String teamNameAlreadyExists;
    public String teamNameTooShort;
    public String teamNameTooLong;
    public String teamCreated;
    public String dontHaveTeam;
    public String cannotChangePermissions;
    public String cannotInvite;
    public String cannotKick;
    public String cannotDeleteTeam;
    public String cannotChangeDescription;
    public String cannotChangeName;
    public String cannotSetHome;
    public String invalidUserRank;
    public String invalidPermission;
    public String permissionSet;
    public String userNotInYourTeam;
    public String cannotPromoteUser;
    public String cannotDemoteUser;
    public String cannotBreakBlocks;
    public String cannotPlaceBlocks;
    public String promotedPlayer;
    public String userPromotedPlayer;
    public String demotedPlayer;
    public String userDemotedPlayer;
    public String userAlreadyInTeam;
    public String inviteAlreadyPresent;
    public String teamInviteSent;
    public String teamInviteReceived;
    public String dontHaveInvite;
    public String noActiveInvite;
    public String teamInviteRevoked;
    public String youHaveBeenKicked;
    public String playerKicked;
    public String cannotKickHigherRank;
    public String leftTeam;
    public String userLeftTeam;
    public String teamDoesntExistByName;
    public String descriptionChanged;
    public String nameChanged;
    public String notInTeamLand;
    public String homeSet;
    public String teleportingHome;
    public String homeNotSet;
    public String homeNotInTeam;
    public String nowBypassing;
    public String noLongerBypassing;
    public String mustBeOwnerToTransfer;
    public String cannotTransferToYourself;
    public String ownershipTransferred;
    public String joinedTeam;
    public String userJoinedTeam;
    public String bankWithdrew;
    public String bankDeposited;
    public String insufficientFundsToWithdraw;
    public String insufficientFundsToDeposit;
    public String noSuchBankItem;
    public String notANumber;
    public String chatFormat;
    public String unknownChatType;
    public String setChatType;

    public Messages() {
        this("Team", "t", "IridiumTeams", "&c");
    }

    public Messages(String team, String command, String pluginName, String color) {
        reloaded = "%prefix% &7Configuration has been reloaded.";
        noPermission = "%prefix% &7You don't have permission for that.";
        mustBeAPlayer = "%prefix% &7You must be a player to execute this command.";
        notAPlayer = "%prefix% &7That player doesn't exist.";
        unknownCommand = "%prefix% &7Unknown Command, Try /" + command + " help.";
        helpCommandHeader = "&8[" + color + "&l" + pluginName + " Help&8]";
        helpCommandFiller = "&8&m ";
        helpCommandMessage = color + "/" + command + " %command%&r: &7%description%";
        helpCommandFooter = " &7Page %page% of %max_page% ";
        helpCommandPreviousPage = color + "<<";
        helpCommandNextPage = color + ">>";
        helpCommandNextPageHover = "&7Click to go to the next page.";
        helpCommandPreviousPageHover = "&7Click to go to the previous page.";
        alreadyHaveTeam = "%prefix% &7You already have a " + team;
        teamNameAlreadyExists = "%prefix% &7A " + team + " by that name already exists";
        teamNameTooShort = "%prefix% &7This " + team + " name is too short. It must be at least %min_length% characters long.";
        teamNameTooLong = "%prefix% &7This " + team + " name is too long. It must be at most %max_length% characters long.";
        teamCreated = "%prefix% &7You have created a " + team + "!";
        dontHaveTeam = "%prefix% &7You dont have a " + team + ".";
        cannotChangePermissions = "%prefix% &7You cannot change this permission.";
        cannotInvite = "%prefix% &7You cannot invite players to the " + team + ".";
        cannotKick = "%prefix% &7You cannot kick players from the " + team + ".";
        cannotDeleteTeam = "%prefix% &7Only the " + team + " owner can delete the " + team + ".";
        cannotChangeDescription = "%prefix% &7You cannot change the " + team + "'s Description.";
        cannotChangeName = "%prefix% &7You cannot change the " + team + "'s Name.";
        cannotSetHome = "%prefix% &7You cannot change the " + team + "'s Home.";
        invalidUserRank = "%prefix% &7User rank doesn't exist.";
        invalidPermission = "%prefix% &7Permission doesn't exist.";
        permissionSet = "%prefix% &7%permission% permission set to %allowed% for %rank%'s.";
        userNotInYourTeam = "%prefix% &7That user is not in your " + team + ".";
        cannotPromoteUser = "%prefix% &7You cannot promote this User";
        cannotDemoteUser = "%prefix% &7You cannot demote this User";
        cannotBreakBlocks = "%prefix% &7You cannot break blocks in this " + team + ".";
        cannotPlaceBlocks = "%prefix% &7You cannot place blocks in this " + team + ".";
        promotedPlayer = "%prefix% &7You have promoted %player% to %rank%.";
        userPromotedPlayer = "%prefix% &7%promoter% has promoted %player% to %rank%.";
        demotedPlayer = "%prefix% &7You have demoted %player% to %rank%.";
        userDemotedPlayer = "%prefix% &7%demoter% has demoted %player% to %rank%.";
        userAlreadyInTeam = "%prefix% &7That user is already a member of your " + team + "";
        inviteAlreadyPresent = "%prefix% &7There is already an active invite for that user.";
        teamInviteSent = "%prefix% &7You have sent a " + team + " invite to %player%.";
        teamInviteReceived = "%prefix% &7You have received a " + team + " invite from %player%.";
        dontHaveInvite = "%prefix% &7You dont have an active invite for that " + team + ".";
        noActiveInvite = "%prefix% &7There is no active invite for that user.";
        teamInviteRevoked = "%prefix% &7You have revoked a " + team + " invite from %player%.";
        youHaveBeenKicked = "%prefix% &7You have been kicked from your " + team + " by %player%";
        playerKicked = "%prefix% &7%player% has been kicked from your " + team + " by %kicker%";
        cannotKickHigherRank = "%prefix% &7You cannot kick somone with a higher rank than you.";
        leftTeam = "%prefix% &7You have left the " + team + " %name%.";
        userLeftTeam = "%prefix% &7%player% has left your " + team + ".";
        teamDoesntExistByName = "%prefix% &7No " + team + " by that name exists.";
        descriptionChanged = "%prefix% &7%player% has changed your " + team + "'s description to %description%.";
        nameChanged = "%prefix% &7%player% has changed your " + team + "'s name to %name%.";
        notInTeamLand = "%prefix% &7You must be inside your " + team + "'s land to do this.";
        homeSet = "%prefix% &7%player% has set " + team + "'s home.";
        teleportingHome = "%prefix% &7Teleporting to your " + team + " home.";
        homeNotSet = "%prefix% &7Your " + team + " home is not set.";
        homeNotInTeam = "%prefix% &7Your " + team + " home is not inside your claim.";
        nowBypassing = "%prefix% &7You are now bypassing " + team + " restrictions.";
        noLongerBypassing = "%prefix% &7You are no longer bypassing " + team + " restrictions.";
        mustBeOwnerToTransfer = "%prefix% &7You must be the " + team + " owner to transfer ownership";
        cannotTransferToYourself = "%prefix% &7You cannot transfer " + team + " ownership to yourself.";
        ownershipTransferred = "%prefix% &7%old_owner% has transferred " + team + " ownership to %new_owner%.";
        joinedTeam = "%prefix% &7You have joined the " + team + " %name%.";
        userJoinedTeam = "%prefix% &7%player% has joined your " + team + ".";
        bankWithdrew = "%prefix% &7You successfully withdrew %amount% %type% from your Faction bank.";
        bankDeposited = "%prefix% &7You successfully deposited %amount% %type% from your Factiopn bank.";
        insufficientFundsToWithdraw = "%prefix% &7You do not have enough %type% to withdraw from your Faction bank.";
        insufficientFundsToDeposit = "%prefix% &7You do not have enough %type% to deposit into your Faction bank.";
        noSuchBankItem = "%prefix% &7That bank item doesn't exist.";
        notANumber = "%prefix% &7That is not a valid number.";
        chatFormat = "%player% &7: &7%message%";
        unknownChatType = "%prefix% &7Unknown " + team + " Chat Type %type%";
        setChatType = "%prefix% &7You have set your " + team + " Chat Type to %type%";
    }
}
