package com.example.api.asset.portfolio;

import org.springframework.hateoas.RepresentationModel;

import java.util.Collections;
import java.util.List;

public class PortfolioCollectionModel extends RepresentationModel<PortfolioCollectionModel> {
    private final List<RepresentationModel<?>> portfolios;

    public PortfolioCollectionModel(List<RepresentationModel<?>> portfolios) {
        this.portfolios = Collections.unmodifiableList(portfolios);
    }

    public List<RepresentationModel<?>> getPortfolios() {
        return portfolios;
    }
}
