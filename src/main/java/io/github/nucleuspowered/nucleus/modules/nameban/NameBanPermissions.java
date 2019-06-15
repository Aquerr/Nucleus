/*
 * This file is part of Nucleus, licensed under the MIT License (MIT). See the LICENSE.txt file
 * at the root of this project for more details.
 */
package io.github.nucleuspowered.nucleus.modules.nameban;

import io.github.nucleuspowered.nucleus.annotationprocessor.RegisterPermissions;
import io.github.nucleuspowered.nucleus.internal.permissions.PermissionMetadata;
import io.github.nucleuspowered.nucleus.internal.permissions.SuggestedLevel;

@RegisterPermissions
public class NameBanPermissions {
    private NameBanPermissions() {
        throw new AssertionError("Nope");
    }

    @PermissionMetadata(descriptionKey = "permission.base", replacements = { "nameban" }, level = SuggestedLevel.ADMIN)
    public static final String BASE_NAMEBAN = "nameban.base";

    @PermissionMetadata(descriptionKey = "permission.base", replacements = { "nameunban" }, level = SuggestedLevel.ADMIN)
    public static final String BASE_NAMEUNBAN = "nameban.unban.base";

}
