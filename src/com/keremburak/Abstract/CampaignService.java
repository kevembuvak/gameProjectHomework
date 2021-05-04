package com.keremburak.Abstract;

import com.keremburak.Entities.Campaign;

public interface CampaignService {
    void addNewCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
}
