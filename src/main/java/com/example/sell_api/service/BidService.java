package com.example.sell_api.service;

import com.example.sell_api.model.entity.Bid;
import com.example.sell_api.model.request.BidRequest;
import com.example.sell_api.model.request.DeleteBidRequest;

import java.util.List;
import java.util.Set;

public interface BidService {
    List<Bid> getList();

    Bid getBid(BidRequest bidRequest);

    void stopThread(String threadName);

    void storeBid();

    void syncBid(BidRequest bidRequest);

    Set<String> listThread();

    void deleteBid(DeleteBidRequest deleteBidRequest);
}
